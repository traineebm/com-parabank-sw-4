package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.OverviewPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePg = new HomePage();
    OverviewPage overviewpage = new OverviewPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePg.enterUsername("Meera08");
        homePg.enterPassword("Asdfg10");
        homePg.clickOnLoginButton();
        String actualMessage = overviewpage.getAccountOverviewDisplayText();
        Assert.assertEquals(actualMessage,"Accounts Overview", "Login unsuccessful");
    }

    @Test
    public void verifyTheErrorMessage(){
        homePg.enterUsername("Asdfg3303");
        homePg.enterPassword("Asdfg10");
        homePg.clickOnLoginButton();
        String actualMessage = homePg.getErrorMessageDisplayText();
        Assert.assertEquals(actualMessage,"The username and password could not be verified","Signing in unsuccessful");
    }

    @Test
    public void userShouldLogOutSuccessfully(){
        homePg.enterUsername("Meera08");
        homePg.enterPassword("Asdfg10");
        homePg.clickOnLoginButton();
        overviewpage.clickOnLogOutLink();
        String actualMessage = homePg.getCustomerLoginDisplayText();
        Assert.assertEquals(actualMessage,"Customer Login", "Login unsuccessful");
    }
}
