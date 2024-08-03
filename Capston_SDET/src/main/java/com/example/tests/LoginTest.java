package com.example.tests;

import com.example.pages.HomePage;
import com.example.utils.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    ExcelUtils excel;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//sumit.rana//IdeaProjects//Capston_SDET/src//main//resources//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V4/");
        excel = new ExcelUtils("C://Users//sumit.rana//IdeaProjects//Capston_SDET//src//main//resources//TestData.xlsx", "Sheet2");
    }

    @Test
    public void validateSuccessfulLogin() {
        HomePage homePage = new HomePage(driver);

        String userId = excel.getCellData(1, 0);
        String password = excel.getCellData(1, 1);

        homePage.enterUserId(userId);
        homePage.enterPassword(password);
        homePage.clickLoginButton();

        String expectedTitle = "Guru99 Bank Manager HomePage";
        String actualTitle = homePage.getPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Login was not successful.");

        Assert.assertTrue(homePage.isManagerLinkPresent(), "Manager link is not present");
        Assert.assertTrue(homePage.isNewCustomerLinkPresent(), "New Customer link is not present");
        Assert.assertTrue(homePage.isEditCustomerLinkPresent(), "Edit Customer link is not present");
        Assert.assertTrue(homePage.isDeleteCustomerLinkPresent(), "Delete Customer link is not present");
        Assert.assertTrue(homePage.isNewAccountLinkPresent(), "New Account link is not present");
        Assert.assertTrue(homePage.isEditAccountLinkPresent(), "Edit Account link is not present");
        Assert.assertTrue(homePage.isDeleteAccountLinkPresent(), "Delete Account link is not present");
        Assert.assertTrue(homePage.isDepositLinkPresent(), "Deposit link is not present");
        Assert.assertTrue(homePage.isWithdrawalLinkPresent(), "Withdrawal link is not present");
        Assert.assertTrue(homePage.isFundTransferLinkPresent(), "Fund Transfer link is not present");
        Assert.assertTrue(homePage.isChangePasswordLinkPresent(), "Change Password link is not present");
        Assert.assertTrue(homePage.isBalanceEnquiryLinkPresent(), "Balance Enquiry link is not present");
        Assert.assertTrue(homePage.isMiniStatementLinkPresent(), "Mini Statement link is not present");
        Assert.assertTrue(homePage.isCustomisedStatementLinkPresent(), "Customised Statement link is not present");
        Assert.assertTrue(homePage.isLogOutLinkPresent(), "Log out link is not present");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
