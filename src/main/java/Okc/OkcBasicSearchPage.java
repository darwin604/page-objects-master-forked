package Okc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OkcBasicSearchPage extends AbstractPageObject {

    public OkcBasicSearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.id("ages_button");
    }

    //region Locators  //all strings within will be set by json object

    //reset
    By clearButtonLocator = By.id("clear_button");

    //age
    By ageButtonLocator = By.id("ages_button_text");
    By minAgeFieldLocator = By.id("min_age");
    By maxAgeFieldLocator = By.id("max_age");
    //String minAge = "19";
    //String maxAge = "50";

    //location
    By locationButtonLocator = By.id("location_interface_button_text");
    By radiusLocationButtonLocator = By.id("radius");
    //String locationRadius = "5 miles";

    //last online
    By lastOnlineButtonLocator = By.id("last_online_select_button_text");
    By lastOnlineOptionButtonLocator = By.id("MATCH_FILTER_LAST_LOGIN604800_base_text");

    //submit
    By submitButtonLocator = By.id("submit_button");

    public void resetSearch(){

        WebElement clearButton = driver.findElement(clearButtonLocator);
        clearButton.click();

    }

    public void submit(){

        WebElement submitButton = driver.findElement(submitButtonLocator);
        submitButton.click();

    }

    public void setAges(String minAge, String maxAge){

        WebElement ageButton = driver.findElement(ageButtonLocator);
        ageButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(minAgeFieldLocator));
        WebElement minAgeField = driver.findElement(minAgeFieldLocator);
        minAgeField.clear();
        minAgeField.sendKeys(minAge);

        WebElement maxAgeField = driver.findElement(maxAgeFieldLocator);
        maxAgeField.clear();
        maxAgeField.sendKeys(maxAge);

    }

    public void setLocationRadius(String locationRadius){

        WebElement locationButton = driver.findElement(locationButtonLocator);
        locationButton.click();

        WebElement radiusLocationButton = driver.findElement(radiusLocationButtonLocator);
        new Select(radiusLocationButton).selectByVisibleText(locationRadius);

    }

    public void setLastOnline(){

        WebElement lastOnlineButton = driver.findElement(lastOnlineButtonLocator);
        lastOnlineButton.click();

        WebElement lastOnlineOptionButton = driver.findElement(lastOnlineOptionButtonLocator);
        lastOnlineOptionButton.click();

    }

    public boolean isAgeSet(){

        return true;

    }


    //By kidsButtonLocator = By.id("ages_button");


    //endregion




   // By basicSearchLocator = By.cssSelector("div#main-menu li.en_search");

//    public QuestionsPage clickQuestionsTab() {
//        WebElement questionsTab = driver.findElement(questionsTabLocator);
//        questionsTab.click();
//        return new QuestionsPage(driver);
//    }

    //region Check elements visibility

    //not needed as this is used as the unique locator upon page load
    public Boolean isAgeButtonClickable(){

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ageButtonLocator));

        List<WebElement> maxAgeButton = driver.findElements(ageButtonLocator);
        return maxAgeButton.size() > 0;

    }

    //

    //endregion


//    public Boolean isQuestionsTabDisplayed() {
//        List<WebElement> questionsTab = driver.findElements(questionsTabLocator);
//        return questionsTab.size() > 0;
//    }
}
