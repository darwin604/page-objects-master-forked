package Okc;

import Pof.PofBasicSearchPage;
import Pof.PofLandingPage;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class OkcExampleTest extends OkcBaseTest {


    JSONObject searchParametersConfig;
    String min_age;
    String max_age;
    String locationRadius;
    String searchParametersConfigLocation = "OkcSearchParameters.txt";

    public OkcExampleTest() throws Exception {
        super();

        fileTest();
//        searchParametersConfig = this.getJSONConfig(searchParametersConfigLocation);
//
//        min_age = searchParametersConfig.getString("min_age");
//        max_age = searchParametersConfig.getString("max_age");
//        locationRadius = searchParametersConfig.getString("locationRadius");

    }


    protected JSONObject getJSONConfig(String CONFIG_FILE_LOCATION) throws JSONException {

        InputStream input =  this.getClass().getClassLoader().getResourceAsStream(CONFIG_FILE_LOCATION);
        return new JSONObject(new JSONTokener(new InputStreamReader(input)));

    }

    protected void fileTest(){


        URL resource = this.getClass().getClassLoader().getResource("/OkcSearchParameters.txt");
        if (resource != null) {
            try {
                resource.openStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test(groups = {"group1"})
    public void clickBasicSearchTest() {

        Okc.OkcSignInPage OkcSignInPage = new OkcSignInPage(driver);
        Okc.OkcLandingPage OkcLandingPage = OkcSignInPage.signIn();
        Okc.OkcBasicSearchPage OkcBasicSearchPage = OkcLandingPage.clickMatchesButton();

        OkcBasicSearchPage.resetSearch();
        OkcBasicSearchPage.setAges(min_age, max_age);
        OkcBasicSearchPage.setLastOnline();
        OkcBasicSearchPage.setLocationRadius(locationRadius);
        OkcBasicSearchPage.submit();

        //PofBasicSearchPage pofBasicSearchPage = pofLandingPage.clickBasicSearchTab();
       // Assert.assertTrue(pofBasicSearchPage.getUniqueElement());
    }

//    @Test(groups = {"group2"})
//    public void isMaxAgeButtonClickableTest() {
//        Pof.PofLandingPage pofLandingPage = new PofLandingPage(driver);
//        PofBasicSearchPage pofBasicSearchPage = pofLandingPage.clickBasicSearchTab();
//        Assert.assertTrue(pofBasicSearchPage.isMaxAgeButtonClickable());
//    }

}