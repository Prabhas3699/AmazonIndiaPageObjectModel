package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    @FindBy(xpath = "(//span[@class='nav-action-inner'])[2]")
    private WebElement signin;
    @FindBy(id = "ap_email")
    private WebElement loginNO;
    @FindBy(id = "continue")
    private WebElement continu;
    @FindBy(id = "ap_password")
    private WebElement passwd;
    @FindBy(id = "signInSubmit")
    private WebElement loginBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String uname, String pwd) {
        signin.click();
        loginNO.sendKeys(uname);
        continu.click();
        passwd.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();
    }

    public String verifyLoginPageTitle(){
        return driver.getTitle();
    }
}
