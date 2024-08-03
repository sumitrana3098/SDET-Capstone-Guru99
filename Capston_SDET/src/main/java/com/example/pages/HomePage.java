package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    By userIdField = By.name("uid");
    By passwordField = By.name("password");
    By loginButton = By.name("btnLogin");
    By resetButton = By.name("btnReset");
    By seleniumLink = By.linkText("Selenium");
    By insuranceProjectsLink = By.linkText("Insurance Project");
    By managerLink = By.linkText("Manager");
    By newCustomerLink = By.linkText("New Customer");
    By editCustomerLink = By.linkText("Edit Customer");
    By deleteCustomerLink = By.linkText("Delete Customer");
    By newAccountLink = By.linkText("New Account");
    By editAccountLink = By.linkText("Edit Account");
    By deleteAccountLink = By.linkText("Delete Account");
    By depositLink = By.linkText("Deposit");
    By withdrawalLink = By.linkText("Withdrawal");
    By fundTransferLink = By.linkText("Fund Transfer");
    By changePasswordLink = By.linkText("Change Password");
    By balanceEnquiryLink = By.linkText("Balance Enquiry");
    By miniStatementLink = By.linkText("Mini Statement");
    By customisedStatementLink = By.linkText("Customised Statement");
    By logOutLink = By.linkText("Log out");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public boolean isLoginButtonPresent() {
        return driver.findElement(loginButton).isDisplayed();
    }

    public boolean isResetButtonPresent() {
        return driver.findElement(resetButton).isDisplayed();
    }

    public boolean isUserIdFieldPresent() {
        return driver.findElement(userIdField).isDisplayed();
    }

    public boolean isPasswordFieldPresent() {
        return driver.findElement(passwordField).isDisplayed();
    }

    public boolean isSeleniumLinkPresent() {
        return driver.findElement(seleniumLink).isDisplayed();
    }

    public boolean isInsuranceProjectsLinkPresent() {
        return driver.findElement(insuranceProjectsLink).isDisplayed();
    }

    public void enterUserId(String userId) {
        driver.findElement(userIdField).sendKeys(userId);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public boolean isManagerLinkPresent() {
        return driver.findElement(managerLink).isDisplayed();
    }

    public boolean isNewCustomerLinkPresent() {
        return driver.findElement(newCustomerLink).isDisplayed();
    }

    public boolean isEditCustomerLinkPresent() {
        return driver.findElement(editCustomerLink).isDisplayed();
    }

    public boolean isDeleteCustomerLinkPresent() {
        return driver.findElement(deleteCustomerLink).isDisplayed();
    }

    public boolean isNewAccountLinkPresent() {
        return driver.findElement(newAccountLink).isDisplayed();
    }

    public boolean isEditAccountLinkPresent() {
        return driver.findElement(editAccountLink).isDisplayed();
    }

    public boolean isDeleteAccountLinkPresent() {
        return driver.findElement(deleteAccountLink).isDisplayed();
    }

    public boolean isDepositLinkPresent() {
        return driver.findElement(depositLink).isDisplayed();
    }

    public boolean isWithdrawalLinkPresent() {
        return driver.findElement(withdrawalLink).isDisplayed();
    }

    public boolean isFundTransferLinkPresent() {
        return driver.findElement(fundTransferLink).isDisplayed();
    }

    public boolean isChangePasswordLinkPresent() {
        return driver.findElement(changePasswordLink).isDisplayed();
    }

    public boolean isBalanceEnquiryLinkPresent() {
        return driver.findElement(balanceEnquiryLink).isDisplayed();
    }

    public boolean isMiniStatementLinkPresent() {
        return driver.findElement(miniStatementLink).isDisplayed();
    }

    public boolean isCustomisedStatementLinkPresent() {
        return driver.findElement(customisedStatementLink).isDisplayed();
    }

    public boolean isLogOutLinkPresent() {
        return driver.findElement(logOutLink).isDisplayed();
    }
}
