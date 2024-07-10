package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
 public static WebDriver driver;
 @Test
 public void openbrowser() throws InterruptedException
 {
   WebDriverManager.chromedriver().setup();
   WebDriver driver =new ChromeDriver();
   driver.get("https://demoqa.com/automation-practice-form/");
   Thread.sleep(10000);
   driver.findElement(By.id("firstName")).sendKeys("Anusree");
   Thread.sleep(10000);
   WebElement label = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
label.click();
   driver.close();
  }
}
