package com.parasoft.parabank.pages;
import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By registerLink = By.linkText("Register");
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@value='Log In']");
    By customerLoginDisplayText = By.xpath("//h2[contains(text(),'Customer Login')]");
    By errorMessageDisplayText = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessageDisplayText(){
        return getTextFromElement(errorMessageDisplayText);
    }

    public String getCustomerLoginDisplayText(){
        return getTextFromElement(customerLoginDisplayText);
    }
}
