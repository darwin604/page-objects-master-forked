package Okc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OkcSignInPage extends AbstractPageObject {

    public OkcSignInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.id("sidebar_signin_username");
    }

    By signInNameLocator = By.id("sidebar_signin_username");
    By signInPasswordLocator = By.id("sidebar_signin_password");

    By submitButtonLocator = By.id("sidebar_signin_button");

    String username = "";
    String password = "";


    public OkcLandingPage signIn() {

        WebElement signInName = driver.findElement(signInNameLocator);
        signInName.sendKeys(username);

        WebElement signInPassword = driver.findElement(signInPasswordLocator);
        signInPassword.sendKeys(password);

        WebElement submitButton = driver.findElement(submitButtonLocator);
        submitButton.click();

        return new OkcLandingPage(driver);

    }


//    public Boolean isSearchTabDisplayed() {
//        List<WebElement> searchTab = driver.findElements(basicSearchTabLocator);
//        return searchTab.size() > 0;
//    }
}
