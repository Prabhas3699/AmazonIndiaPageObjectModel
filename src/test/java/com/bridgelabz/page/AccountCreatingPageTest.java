package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.page.AccountCreatingPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountCreatingPageTest extends BaseClass {
    AccountCreatingPage accountCreatingPage;

    @BeforeMethod
    public void setup(){
        launchBrowser();
        accountCreatingPage = new AccountCreatingPage();
    }

    @Test
    public void verifyLoginPageTitleTest() {
        String loginPageTitle = accountCreatingPage.verifyLoginPageTitle();
        Assert.assertEquals(loginPageTitle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }

    @Test
    public void AccCreatingPageTest(){
        accountCreatingPage.creating();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
