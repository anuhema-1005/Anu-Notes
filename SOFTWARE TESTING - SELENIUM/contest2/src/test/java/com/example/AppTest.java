package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest 
{
  @DataProvider(name ="loginData")
  public Object[][] getLoginData() throws IOException{
   String excelfilepath = "C:\\Users\\HP\\Desktop\\Project 1\\contest2\\test.xlsx";
   // File file =new File(excelfilepath);
   FileInputStream inputStream =new FileInputStream(new File(excelfilepath));
   // Create a workbook object for excel file
   Workbook workbook =new XSSFWorkbook(inputStream);
   // Get the first sheet of the excel workbook
   Sheet sheet = workbook.getSheetAt(0);
   // Get the number of rows in the sheet
   int rowCount = sheet.getPhysicalNumberOfRows();
   // Create a 2D array to store test data
   Object [][] data=new Object[rowCount-1][2];
   // Iterate over all the rows in the excel sheet (skipping the)
   for(int i=1; i<rowCount;i++){
      Row row =sheet.getRow(i);
      // Get data from columns
      String username = row.getCell(0).getStringCellValue();
      String password = row.getCell(1).getStringCellValue();
      // Store data in the array
      data[i-1][0]=username;
      data[i-1][1]=password;
   }
   workbook.close();
   inputStream.close();
   return data;
  }
  @Test (dataProvider = "loginData")
  public void testLogin(String username, String password){
    System.out.println("Logging in with username: "+ username+ " and password "+password);
  }
}
