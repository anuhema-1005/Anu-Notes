package com.example.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    @FindBy(name = "uid")
    WebElement userid;

    @FindBy(name = "password")
    WebElement pass;
    
    @FindBy(name = "btnLogin")
    WebElement btnLogin;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setUsername(String name){
        userid.sendKeys(name);
    }

    public void setPassword(String password){
        pass.sendKeys(password);
    }

    public void btnclick(){
        btnLogin.click();
    }

}
