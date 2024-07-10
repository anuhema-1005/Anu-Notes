package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
    public static WebDriver driver;

    @Test
    public void openbrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mayoclinic.org/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement dropdownContainer = driver.findElement(By.xpath(
                "/html/body/div[1]/div/div/div[2]/div[2]/div/header/div[2]/div/nav/div/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/ul/li[5]/div[1]/div/button/span/span[1]"));
        dropdownContainer.click();
        WebElement Options = dropdownContainer.findElement(By.xpath(
                "/html/body/div[1]/div/div/div[2]/div[2]/div/header/div[2]/div/nav/div/div[2]/div[2]/div/div/div[1]/div[2]/div[1]/ul/li[5]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/a/span/span/span[1]/span"));
        Options.click();
        Thread.sleep(2000);
        WebElement amt =driver.findElement(By.xpath("/html/body/form[2]/div[3]/main/div/div/div[2]/div[1]/div/div/div[1]/fieldset[1]/div[1]/label[3]"));
        amt.click();
        Select dropdown = new Select(driver.findElement(By.id("designation")));
        dropdown.selectByVisibleText("Medical Education");
        Thread.sleep(2000);
        WebElement checkbox =driver.findElement(By.xpath("/html/body/form[2]/div[3]/main/div/div/div[2]/div[1]/div/div/div[1]/fieldset[2]/div[1]/label"));
        checkbox.click();
        Select dropdown1 = new Select(driver.findElement(By.id("personalTitle")));
        dropdown1.selectByVisibleText("Mr.");
        Thread.sleep(2000);
        WebElement fname = driver.findElement(By.id("personalFirstName"));
        fname.sendKeys("Tester");
        WebElement lname = driver.findElement(By.id("personalLastName"));
        lname.sendKeys("TesterLast");
        Select dropdown2 = new Select(driver.findElement(By.id("personalCountry")));
        dropdown2.selectByVisibleText("India");
        Thread.sleep(2000);
        Select dropdown3 = new Select(driver.findElement(By.id("personalState")));
        dropdown3.selectByVisibleText("NA");
        Thread.sleep(2000);
        WebElement address=driver.findElement(By.id("personalAddress"));
        address.sendKeys("WXQ5+58F, BK Pudur, Sugunapuram East");
        WebElement city =driver.findElement(By.id("personalCity"));
        city.sendKeys("Kuniamuthur");
        WebElement pincode = driver.findElement(By.id("personalZip"));
        pincode.sendKeys("641001");
        WebElement phone =driver.findElement(By.id("personalPhone"));
        phone.sendKeys("987456321");
        WebElement email=driver.findElement(By.id("personalEmail"));
        email.sendKeys("s@gmail.com");
        WebElement btn=driver.findElement(By.xpath("/html/body/form[2]/div[3]/main/div/div/div[2]/div[1]/div/div/div[1]/div/div/button"));
        btn.click();
        driver.close();
    }
}
