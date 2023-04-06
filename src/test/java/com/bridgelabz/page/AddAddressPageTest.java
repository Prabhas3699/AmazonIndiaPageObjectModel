package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.util.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddAddressPageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    AddressPage addressPage;
    AddAddressPage addAddressPage;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("9787291404", "prabha");
        addressPage = homePage.gotoAddressPage();
    }

    @Test
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Your Addresses");
    }

    @Test
    public void addAddressTest(){
        addAddressPage=addressPage.gotoAddAddress();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
