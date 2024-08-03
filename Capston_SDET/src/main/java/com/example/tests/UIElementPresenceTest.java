package com.example.tests;

import com.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UIElementPresenceTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//sumit.rana//IdeaProjects//Capston_SDET/src//main//resources//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V4/");
    }

    @Test
    public void validateUIElements() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isLoginButtonPresent(), "Login button is not present");
        Assert.assertTrue(homePage.isResetButtonPresent(), "Reset button is not present");
        Assert.assertTrue(homePage.isUserIdFieldPresent(), "UserID field is not present");
        Assert.assertTrue(homePage.isPasswordFieldPresent(), "Password field is not present");
        Assert.assertTrue(homePage.isSeleniumLinkPresent(), "Selenium link is not present");
        Assert.assertTrue(homePage.isInsuranceProjectsLinkPresent(), "Insurance Projects link is not present");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
