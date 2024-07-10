// package com.example.pageobject;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;

// public class LoginPage {
//     public WebDriver driver;

//     @FindBy (className = "cmp-button__inner-main")WebElement givingmayo;
//     @ FindBy (xpath = "/html/body/div[1]/div/div/div[2]/div[2]/div/header/div[2]/div/nav/div/div[2]/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/ul/li[4]/div/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/div[5]/div[1]/button/span/span[2]/span/svg")
//     WebElement givingnow;

//     @FindBy (id = "amt3")
//     WebElement amt;

   

//     public LoginPage(WebDriver driver){
//         this.driver = driver;
//         PageFactory.initElements(driver,this);
//     }

//     public void setgivingmayo() throws InterruptedException{
//         Thread.sleep(5000);
//         givingmayo.click();
//     }
//     public void setgivingnow() throws InterruptedException{
//         Thread.sleep(5000);
//         givingnow.click();
//     }
//     public void setamt() throws InterruptedException{
//         Thread.sleep(5000);
//         amt.click();
//     }
// }
