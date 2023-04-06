package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    private WebElement home;

    public SearchPage(){
        PageFactory.initElements(driver,this);
    }

    public HomePage homePage(){
        home.click();
        return new HomePage();
    }
}
