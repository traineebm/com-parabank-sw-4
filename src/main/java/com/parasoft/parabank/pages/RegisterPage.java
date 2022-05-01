package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerLink = By.linkText("Register");
    By signingUpMessageText = By.xpath("//h1[contains(text(),'Signing up is easy!')]");
    By firstNameTextbox = By.name("customer.firstName");
    By lastNameTextbox = By.name("customer.lastName");
    By addressTextbox = By.id("customer.address.street");
    By cityTextbox = By.name("customer.address.city");
    By stateTextbox = By.name("customer.address.state");
    By zipCodeTextbox = By.name("customer.address.zipCode");
    By phoneNumberTextbox = By.name("customer.phoneNumber");
    By ssnNumberTextbox = By.name("customer.ssn");
    By usernameTextbox = By.name("customer.username");
    By passwordTextbox = By.name("customer.password");
    By confirmPasswordTextbox = By.name("repeatedPassword");
    By registerButton = By.xpath("//tbody/tr[13]/td[2]/input[1]");
    By accountCreatedSuccessfullyDisplayText = By.xpath("//div[@id='bodyPanel']/child::div[2]/child::p");


    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public String getSigningUpIsEasyText() {
        return getTextFromElement(signingUpMessageText);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameTextbox,firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameTextbox,lastname);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressTextbox,address);
    }

    public void enterCity(String city) {
        sendTextToElement(cityTextbox,city);
    }

    public void enterState(String state) {
        sendTextToElement(stateTextbox,state);
    }

    public void enterZipcode(String zipcode) {
        sendTextToElement(zipCodeTextbox,zipcode);
    }

    public void enterPhoneNumber(String phonenumber) {
        sendTextToElement(phoneNumberTextbox, phonenumber);
    }

    public void enterSsnNumber(String ssnnumber) {
        sendTextToElement(ssnNumberTextbox, ssnnumber);
    }

    public void enterUsername(String username) {
        sendTextToElement(usernameTextbox, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordTextbox, password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmPasswordTextbox, confirmpassword);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

    public String getCreatedSuccessfullyDisplayText() {
        return getTextFromElement(accountCreatedSuccessfullyDisplayText);
    }
}
