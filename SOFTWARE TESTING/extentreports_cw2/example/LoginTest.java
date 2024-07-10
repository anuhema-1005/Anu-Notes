package com.example;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    static ExtentReports report;
    static ExtentTest test;
    public static WebDriver driver;
    @BeforeClass
    public void beforeClass()
    {
        report =new ExtentReports("C:\\Users\\HP\\Desktop\\Project 1\\extentreports_cw2\\s.html");
        test=report.startTest("Extent Report Demo");
    }
    @Test (dataProvider = "loginData", dataProviderClass=AppTest.class)
    public void testLogin(String From, String To, String Departure, String Return) throws InterruptedException
    {
        
        driver =new ChromeDriver();
        driver.get("https://www.ixigo.com/");
        Thread.sleep(5000);
        if(driver.getTitle().equals("ixigo")){
            test.log(LogStatus.PASS,"Test Passed");
        }
        else{
            test.log(LogStatus.FAIL,"Test Failed");
            captureScreenshot();
        }
       
        // Testcase 1
       WebElement roundtrip =driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[1]/div[1]/div/button[2]"));
       roundtrip.click();
      // WebElement fromDropdown = driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div"));

       // Initialize Select class with the dropdown element
      
       driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div")).sendKeys("IDP");
    
           
       //element.sendKeys("IDP");
       // Select the option by visible text
      // select.selectByVisibleText("IDP");
    //    WebElement Options = fromdropdown.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div"));
    //    Options.click();
       Thread.sleep(2000);
    }
   
  
    @AfterClass
    public void endTest(){
        report.endTest(test);
        report.flush();
        driver.quit();
    }
    public void captureScreenshot(){
        try{
           TakesScreenshot screenshot = (TakesScreenshot)driver;
           File src = screenshot.getScreenshotAs(OutputType.FILE);
           File dest = new File("C:\\Users\\HP\\Desktop\\Project 1\\extentreports_cw2\\u.png");
           // String path=dest.getAbsolutePath();
           FileUtils.copyFile(src, dest);
           // test.log(LogStatus.FAIL, "Screenshot below: " + test.addScreenCapture(path));
           test.log(LogStatus.FAIL,"screenshot",test.addScreenCapture(dest.getAbsolutePath()));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    

}
