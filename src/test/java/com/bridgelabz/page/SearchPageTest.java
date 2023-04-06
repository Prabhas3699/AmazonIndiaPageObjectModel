package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    AddressPage addressPage;
    AddAddressPage addAddressPage;
    SearchPage searchPage;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("9787291404", "prabha");
        addressPage = homePage.gotoAddressPage();
        addAddressPage=addressPage.gotoAddAddress();
    }

    @Test
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Your Addresses");
    }

    @Test
    public void ClickOnSearchPageTest(){searchPage=addAddressPage.clickOnSearch();}

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
