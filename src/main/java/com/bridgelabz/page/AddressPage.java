package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BaseClass {

    @FindBy(xpath = "//div[@id='ya-myab-plus-address-icon']")
    private WebElement addAddress;
//    @FindBy(xpath = "(//span[@class='a-button-text a-declarative'])[1]")
//    private WebElement country;
//    @FindBy(xpath = "//span[contains(text(),'India')]")
//    private WebElement countryName;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressFullName']")
    private WebElement name;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
    private WebElement mobileNumber;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressPostalCode']")
    private WebElement pincode;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine1']")
    private WebElement flatno;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressLine2']")
    private WebElement area;
    @FindBy(xpath = "//input[@id='address-ui-widgets-landmark']")
    private WebElement landmark;
    @FindBy(xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
    private WebElement city;
    @FindBy(xpath = "(//span[@class='a-button-text a-declarative'])[2]")
    private WebElement state;
    @FindBy(xpath = "//span[contains(text(),'TAMIL NADU')]")
    private WebElement stateName;
    @FindBy(xpath = "(//input[@class='a-button-input'])[3]")
    private WebElement getAddAddress;

    public AddressPage(){
        PageFactory.initElements(driver,this);
    }


    public AddAddressPage gotoAddAddress(){
        addAddress.click();
        actions=new Actions(driver);
//        actions.moveToElement(country).perform();
//        countryName.click();
        name.sendKeys("Prabhakaran");
        mobileNumber.sendKeys("9787291404");
        pincode.sendKeys("603306");
        flatno.sendKeys("no.1,Thambiran House");
        area.sendKeys("Thambiran Nagar");
        landmark.sendKeys("Gayathri Store");
        city.sendKeys("Maduranthakam");
        actions.moveToElement(state).perform();
        stateName.click();
        getAddAddress.click();
        return new AddAddressPage();
    }

    public String verifyLoginPageTitle(){
        return driver.getTitle();
    }
}
