package com.example.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public String url = "https://demo.guru99.com/v3/index.php";
    public String username = "mngr563128";
    public String pasword = "qyjUtab";
    public WebDriver driver;

    // @org.testng.annotations.BeforeClass


    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
    }

    
    @AfterClass
    public void close(){
        driver.quit();
    }
}
