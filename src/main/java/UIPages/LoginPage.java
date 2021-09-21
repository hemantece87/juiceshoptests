package UIPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class LoginPage {

    WebDriver driver;

    By email1 = By.id("email");
    By pass = By.id("password");
    By loginButton = By.id("loginButton");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage loginUser(String userName, String password) {

        WaitUtils.waitForElementToBePresent(driver, email1);
        driver.findElement(email1).sendKeys(userName);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}
