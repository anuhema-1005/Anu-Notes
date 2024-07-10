package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest 
{
  @DataProvider(name ="loginData")
  public Object[][] getLoginData() throws IOException{
   String excelfilepath = "C:\\Users\\HP\\Downloads\\Extent reports.xlsx";
   FileInputStream inputStream =new FileInputStream(new File(excelfilepath));
   Workbook workbook =new XSSFWorkbook(inputStream);
   Sheet sheet = workbook.getSheetAt(0);
   int rowCount = sheet.getPhysicalNumberOfRows();
   System.out.print(rowCount);
   Object [][] data=new Object[rowCount-1][4];
   for(int i=1; i<rowCount;i++){ 
          Row row = sheet.getRow(i);
            if (row != null) {
                for (int j = 0; j < 4; j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                        if (cell.getCellType() == CellType.NUMERIC) {
                            // Check if the cell contains a date value
                            if (DateUtil.isCellDateFormatted(cell)) {
                                java.util.Date dateCellValue = cell.getDateCellValue();
                                SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy");
                                data[i - 1][j] = dateFormat.format(dateCellValue);
                            } else {
                                // Handle other numeric values
                                data[i - 1][j] = String.valueOf(cell.getNumericCellValue());
                            }
                        } else if (cell.getCellType() == CellType.STRING) {
                            data[i - 1][j] = cell.getStringCellValue();
                        } else {
                            data[i - 1][j] = "";
                        }
                    } else {
                        data[i - 1][j] = "";
                    }
                }
            }
   }
   workbook.close();
   inputStream.close();
   return data;
  }
  @Test (dataProvider = "loginData")
  public void testLogin(String From, String To, String Departure, String Return){
    System.out.println("Travelling from "+From+" on "+Departure+" To "+To+" and Returning on "+Return);
  }
}
