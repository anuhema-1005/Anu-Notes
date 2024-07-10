package com.example;

// import static org.junit.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    static Logger log=Logger.getLogger(AppTest.class);
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        PropertyConfigurator.configure("F:\\NOTES\\SOFTWARE TESTING\\log4j\\src\\main\\Resources\\log4j.properties");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        log.info("success");
        Thread.sleep(5000);
    }
}