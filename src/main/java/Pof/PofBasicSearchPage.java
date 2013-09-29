package Pof;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class PofBasicSearchPage extends AbstractPageObject {

    public PofBasicSearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getUniqueElement() {
        return By.xpath("//button[2]");
    }

    By maxAgeButtonLocator = By.xpath("//button[2]");
   // By basicSearchLocator = By.cssSelector("div#main-menu li.en_search");

//    public QuestionsPage clickQuestionsTab() {
//        WebElement questionsTab = driver.findElement(questionsTabLocator);
//        questionsTab.click();
//        return new QuestionsPage(driver);
//    }

    //region Check elements visibility
    public Boolean isMaxAgeButtonClickable(){

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(maxAgeButtonLocator));

        List<WebElement> maxAgeButton = driver.findElements(maxAgeButtonLocator);
        return maxAgeButton.size() > 0;

    }



    //endregion


//    public Boolean isQuestionsTabDisplayed() {
//        List<WebElement> questionsTab = driver.findElements(questionsTabLocator);
//        return questionsTab.size() > 0;
//    }
}
