package com.example.tests;

import com.example.pages.HomePage;
import com.example.utils.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TitleTest {
    WebDriver driver;
    ExcelUtils excel;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//sumit.rana//IdeaProjects//Capston_SDET/src//main//resources//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V4/");
        excel = new ExcelUtils("C://Users//sumit.rana//IdeaProjects//Capston_SDET//src//main//resources//TestData.xlsx", "Sheet1");
    }

    @Test
    public void validateTitle() {
        HomePage homePage = new HomePage(driver);
        String expectedTitle = excel.getCellData(1, 0);
        String actualTitle = homePage.getPageTitle();
        System.out.println("Title on Page : "+actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
