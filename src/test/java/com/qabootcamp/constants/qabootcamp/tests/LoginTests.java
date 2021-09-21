package com.qabootcamp.constants.qabootcamp.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void openHomePageTest() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button//span[text()=\"Dismiss\"]")).click();
        driver.findElement(By.id("navbarAccount")).click();
        driver.findElement(By.id("navbarLoginButton")).click();
        Thread.sleep(1000);
    }


}
