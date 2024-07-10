package com.example;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    @Test (dataProvider = "loginData", dataProviderClass=AppTest.class)
    public void testLogin(String username, String password) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://dbankdemo.com/bank/login");
        Thread.sleep(10000);
        WebElement usernamefield = driver.findElement(By.id("username"));
        usernamefield.sendKeys(username); 
        Thread.sleep(10000);
        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys(password);
        Thread.sleep(10000);
        WebElement loginButton = driver.findElement(By.id("submit"));
        loginButton.click();

        driver.findElement(By.id("deposit-menu-item")).click();
        WebElement selectAccountDropdown = driver.findElement(By.id("selectedAccount"));
        selectAccountDropdown.sendKeys("Individual Checking (Standard Checking)");
        WebElement depositAmountField = driver.findElement(By.id("amount"));
        depositAmountField.sendKeys("5000");
        driver.findElement(By.xpath("//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[2]/button[1]")).click();

        driver.findElement(By.id("withdraw-menu-item")).click();
        WebElement selectAccount = driver.findElement(By.id("selectedAccount"));
        selectAccount.sendKeys("Individual Checking (Standard Checking)");
        WebElement withdraw_amount= driver.findElement(By.xpath("//*[@id=\"amount\"]"));
        withdraw_amount.sendKeys("3000");
        driver.findElement(By.xpath("//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[2]/button[1]")).click();

        driver.quit();
    }
    static ExtentReports report;
    static ExtentTest test;
    public static WebDriver driver;
    @BeforeClass
    public void beforeClass()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        report =new ExtentReports("C:\\Users\\HP\\Desktop\\Project 1\\contest2\\h.html");
        test=report.startTest("Extent Report Demo");
    }
    @Test
    public void testMethod()
    {
       if(driver.getTitle().equals("Digital")){
            test.log(LogStatus.PASS,"Test Passed");
       }
       else{
        test.log(LogStatus.FAIL,"Test Failed");
       }
    }
    @AfterClass
    public void endTest(){
        report.endTest(test);
        report.flush();
        driver.quit();
    }
    static Logger log=Logger.getLogger(AppTest.class);
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        PropertyConfigurator.configure("contest2/src/main/Resources/log4j.properties");
        log.info("success");
        Thread.sleep(5000);
    }
    

}
