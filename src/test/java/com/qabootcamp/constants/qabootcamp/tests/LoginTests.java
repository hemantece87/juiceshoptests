package com.qabootcamp.constants.qabootcamp.tests;

import UIPages.HomePage;
import UIPages.LoginPage;
import UIPages.RegisterPage;
import com.qabootcamp.constants.UserConstants;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.UserDataUtils;

public class LoginTests extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @Test
    public void registerAndLoginTest() {
        String username = UserDataUtils.getUserEmail();
        String password = UserConstants.PASSWORD;

        homePage = new HomePage(driver);
        homePage.closeWelcomeBanner()
                .clickLoginButton()
                .registerUser(username, password)
                .loginUser(username, password);

        Assert.assertTrue(homePage.isShoppingCartButtonVisible());
    }
}
