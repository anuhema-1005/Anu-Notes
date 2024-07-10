package com.example.testcases;

import org.testng.annotations.Test;

import com.example.pageobject.LoginPage;

public class LoginTest extends BaseClass {
    @Test
    public void firstTest() throws InterruptedException{
        driver.get(url);
        LoginPage login = new LoginPage(driver);
        login.setUsername(username);
        Thread.sleep(5000);
        login.setPassword(pasword);
        Thread.sleep(5000);
        login.btnclick();
        Thread.sleep(5000);
        driver.quit();
    }
}