package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPage extends BaseClass {
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchBar;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchTab;

    public AddAddressPage() {
        PageFactory.initElements(driver, this);
    }

    public SearchPage clickOnSearch(){
        actions=new Actions(driver);
        actions.doubleClick(searchBar).perform();
        searchBar.sendKeys("Headphones");
        searchTab.click();
        return new SearchPage();
    }

    public String verifyHomePageTitle() {
        return driver.getTitle();
    }
}
