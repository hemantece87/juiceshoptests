package UIPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class RegisterPage {

    WebDriver driver;

    By newCustomerLink = By.id("newCustomerLink");
    By email = By.id("emailControl");
    By password = By.id("passwordControl");
    By repeatPassword = By.id("repeatPasswordControl");
    By selectOption = By.xpath(".//*[contains(@class,'mat-option-text')]");
    By openDropDown = By.className("mat-select-arrow");
    By securityAnswer = By.id("securityAnswerControl");
    By registerButton = By.id("registerButton");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage registerUser(String email_add, String passwordValue) {

        WaitUtils.waitForElementToBeClickable(driver, driver.findElement(newCustomerLink));

        driver.findElement(newCustomerLink).click();
        driver.findElement(email).sendKeys(email_add);
        driver.findElement(password).sendKeys(passwordValue);
        driver.findElement(repeatPassword).sendKeys(passwordValue);
        driver.findElement(openDropDown).click();
        driver.findElement(selectOption).click();
        driver.findElement(securityAnswer).sendKeys("Test");
        driver.findElement(registerButton).click();
        return new LoginPage(driver);
    }

}
