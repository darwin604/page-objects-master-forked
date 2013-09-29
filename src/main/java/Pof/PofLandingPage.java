package Pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PofLandingPage extends AbstractPageObject {

    public PofLandingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.cssSelector("div#main-menu li.en_search");
    }

    By menuBarLocator = By.cssSelector("div#hmenus");
    By basicSearchTabLocator = By.cssSelector("div#main-menu li.en_search");

    public PofBasicSearchPage clickBasicSearchTab() {
        WebElement searchTab = driver.findElement(basicSearchTabLocator);
        searchTab.click();
        return new PofBasicSearchPage(driver);
    }

    public Boolean isSearchTabDisplayed() {
        List<WebElement> searchTab = driver.findElements(basicSearchTabLocator);
        return searchTab.size() > 0;
    }
}
