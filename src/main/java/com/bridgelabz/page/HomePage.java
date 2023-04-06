package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//span[contains(text(),'Select your address')]")
    private WebElement addressLink;
    @FindBy(xpath = "//a[contains(text(),'Add an address or pick-up point')]")
    private WebElement getAddressLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public AddressPage gotoAddressPage() {
        addressLink.click();
        actions=new Actions(driver);
        actions.doubleClick(getAddressLink).perform();
        return new AddressPage();
    }

    public String verifyHomePageTitle() {
        return driver.getTitle();
    }
}
