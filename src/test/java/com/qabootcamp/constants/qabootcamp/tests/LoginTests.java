package com.qabootcamp.constants.qabootcamp.tests;

import UIPages.HomePage;
import UIPages.LoginPage;
import UIPages.RegisterPage;
import com.qabootcamp.constants.UserConstants;
import model.CustomerData;
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
        
        CustomerData customerData = new CustomerData.CustomerFormBuilder(username, password, password)
                .secretAnswer("test")
                .build();

        homePage = new HomePage(driver);
        homePage.closeWelcomeBanner()
                .clickLoginButton()
                .registerUser(customerData.getEmailId(), customerData.getPassword())
                .loginUser(customerData.getEmailId(), customerData.getPassword());

        Assert.assertTrue(homePage.isShoppingCartButtonVisible());
    }
}
