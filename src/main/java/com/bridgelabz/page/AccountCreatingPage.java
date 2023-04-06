package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatingPage extends BaseClass {
    @FindBy(xpath = "(//span[@class='nav-action-inner'])[2]")
    private WebElement signin;
    @FindBy(id = "createAccountSubmit")
    private WebElement createacc;
    @FindBy(id = "ap_customer_name")
    private WebElement name;
    @FindBy(id = "ap_phone_number")
    private WebElement phonenumber;
    @FindBy(id = "ap_password")
    private WebElement passwd;
    @FindBy(id = "continue")
    private WebElement continu;

    public AccountCreatingPage() {
        PageFactory.initElements(driver, this);
    }

    public void creating() {
        signin.click();
        createacc.click();
        name.sendKeys("Prabhakaran");
        phonenumber.sendKeys("9677513412");
        passwd.sendKeys("prabha");
        continu.click();
    }

    public String verifyLoginPageTitle(){
        return driver.getTitle();
    }
}
