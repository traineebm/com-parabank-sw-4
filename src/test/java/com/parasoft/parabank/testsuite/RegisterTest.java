package com.parasoft.parabank.testsuite;
import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.utility.Utility;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends Utility {

    HomePage homePg = new HomePage();
    RegisterPage regPg = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homePg.clickOnRegisterLink();

        //Validate actual and expected message
        String actualMessage = regPg.getSigningUpIsEasyText();
        Assert.assertEquals(actualMessage, "Signing up is easy!", "Incorrect details: Please try again");
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePg.clickOnRegisterLink();
        regPg.enterFirstName("Meera");
        regPg.enterLastName("Parmar");
        regPg.enterAddress("10 Brixton Road");
        regPg.enterCity("Watford");
        regPg.enterState("UK");
        regPg.enterZipcode("WD24 4DX");
        regPg.enterPhoneNumber("7790697597");
        regPg.enterSsnNumber("123456");
        regPg.enterUsername("Meera089");
        regPg.enterPassword("Asdfg10");
        regPg.enterConfirmPassword("Asdfg10");
        regPg.clickOnRegisterButton();
        String actualMessage = regPg.getCreatedSuccessfullyDisplayText();
        Assert.assertEquals(actualMessage, "Your account was created successfully. You are now logged in.", "error");
    }
}
