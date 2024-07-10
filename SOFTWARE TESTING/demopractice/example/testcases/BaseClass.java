// package com.example.testcases;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.AfterClass;
// import org.testng.annotations.BeforeClass;

// import io.github.bonigarcia.wdm.WebDriverManager;

// public class BaseClass {
//     public String url = "https://www.mayoclinic.org/";
//     public String username = "mngr563128";
//     public String pasword = "qyjUtab";
//     public WebDriver driver;

//     // @org.testng.annotations.BeforeClass


//     @BeforeClass
//     public void setup(){
//         WebDriverManager.chromedriver().setup();
//         driver = new ChromeDriver();
//         driver.manage().window().maximize();
//     }

    
//     @AfterClass
//     public void close(){
//         driver.quit();
//     }
// }
