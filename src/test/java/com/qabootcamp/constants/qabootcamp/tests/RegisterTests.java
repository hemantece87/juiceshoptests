package com.qabootcamp.constants.qabootcamp.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTest{


    @Test
    public void createCustomerTest() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button//span[text()=\"Dismiss\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"navbarAccount\"]/span[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"navbarLoginButton\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"newCustomerLink\"]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"emailControl\"]")).sendKeys("test1@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"passwordControl\"]")).sendKeys("Test123");
        driver.findElement(By.xpath("//*[@id=\"repeatPasswordControl\"]")).sendKeys("Test123");

        driver.findElement(By.xpath("//*[@id=\"mat-select-value-3\"]/span")).click();



        Thread.sleep(1000);

    }
}
