package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    @Test (dataProvider = "loginData", dataProviderClass=AppTest.class)
    public void testLogin(String username, String password) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://placement.skcet.ac.in/");
        Thread.sleep(10000);
        WebElement usernamefield = driver.findElement(By.id("email"));
        usernamefield.sendKeys(username);
        Thread.sleep(10000);
        WebElement login = driver.findElement(By.xpath("//*[@id=\"formFieldsID\"]/div[3]/div/div/div[1]/app-button/button"));
        login.click();
        Thread.sleep(10000);
        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys(password);
        Thread.sleep(10000);
        // Find and click the login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"formFieldsID\"]/div[3]/div/div/div/app-button/button/span"));
        loginButton.click();
        Thread.sleep(10000);
        driver.quit();
    }
}
