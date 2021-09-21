package com.qabootcamp.constants.qabootcamp.tests;

import com.qabootcamp.constants.FrameWorkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ReadPropertyFile;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setupDriver() throws Exception {
        System.setProperty("webdriver.chrome.driver", FrameWorkConstants.getChromeDriverPath());
        driver = new ChromeDriver();
        driver.get(ReadPropertyFile.getProperty("url"));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
