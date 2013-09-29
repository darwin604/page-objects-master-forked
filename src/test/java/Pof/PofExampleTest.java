package Pof;

import Pof.PofBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PofExampleTest extends PofBaseTest {

    public PofExampleTest() {
        super();
    }

    @Test(groups = {"group1"})
    public void clickBasicSearchTest() {
        PofLandingPage pofLandingPage = new PofLandingPage(driver);
        PofBasicSearchPage pofBasicSearchPage = pofLandingPage.clickBasicSearchTab();
       // Assert.assertTrue(pofBasicSearchPage.getUniqueElement());
    }

    @Test(groups = {"group2"})
    public void isMaxAgeButtonClickableTest() {
        PofLandingPage pofLandingPage = new PofLandingPage(driver);
        PofBasicSearchPage pofBasicSearchPage = pofLandingPage.clickBasicSearchTab();
        Assert.assertTrue(pofBasicSearchPage.isMaxAgeButtonClickable());
    }

}