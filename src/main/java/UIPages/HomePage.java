package UIPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class HomePage {
    WebDriver driver;

    By welcomeBanner = By.xpath("(//button[contains(@aria-label,'Close Welcome Banner')])[1]");
    By myAccount = By.id("navbarAccount");
    By login = By.id("navbarLoginButton");

    By yourBasketLocator = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]/span[1]/span[1]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage closeWelcomeBanner() {
        WebElement welcomeBannerElement = driver.findElement(welcomeBanner);
        WaitUtils.waitForElementToBeClickable(driver, welcomeBannerElement);
        welcomeBannerElement.click();
        return this;
    }

    public RegisterPage clickLoginButton() {
        driver.findElement(myAccount).click();
        driver.findElement(login).click();
        return new RegisterPage(driver);
    }

    public boolean isShoppingCartButtonVisible() {
        return driver.findElement(yourBasketLocator).isDisplayed();
    }
}
