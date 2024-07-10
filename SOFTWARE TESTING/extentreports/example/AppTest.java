package com.example;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
    static ExtentReports report;
    static ExtentTest test;
    public static WebDriver driver;
    @BeforeClass
    public void beforeClass()
    {
        report =new ExtentReports("C:\\Users\\HP\\Desktop\\Project 1\\extentreports\\report.html");
        test=report.startTest("Extent Report Demo");
    }
    @Test
    public void testMethod()
    {
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://www.google.com");
       if(driver.getTitle().equals("Goog")){
            test.log(LogStatus.PASS,"Test Passed");
       }
       else{
        test.log(LogStatus.FAIL,"Test Failed");
        captureScreenshot();
       }
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
           File dest = new File("C:\\Users\\HP\\Desktop\\Project 1\\extentreports\\screenshot.png");
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