package Okc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class OkcLandingPage extends AbstractPageObject {

    public OkcLandingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.id("nav_matches");
    }

    By matchesButtonLocator = By.id("nav_matches");



    public OkcBasicSearchPage clickMatchesButton() {


        WebElement matchesButton = driver.findElement(matchesButtonLocator);
        matchesButton.click();

        return new OkcBasicSearchPage(driver);

    }


//    public Boolean isSearchTabDisplayed() {
//        List<WebElement> searchTab = driver.findElements(basicSearchTabLocator);
//        return searchTab.size() > 0;
//    }
}
