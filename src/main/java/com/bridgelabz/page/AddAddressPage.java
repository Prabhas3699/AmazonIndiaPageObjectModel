package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class AddAddressPage extends BaseClass {
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchBar;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchTab;
    @FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
    private WebElement productName;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCart;


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
    public SearchProduct clickOnProduct(){
        js.executeScript("window.scrollBy(0, 300)");
        productName.click();
        String parentWindowHandleId = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            System.out.println("window handle Id: " + windowHandle);
            if (!windowHandle.equals(parentWindowHandleId)) {
                driver.switchTo().window(windowHandle);
            }
        }
        int x=addToCart.getLocation().getX();
        int y=addToCart.getLocation().getY();
        js.executeScript("window.scrollBy("+x+","+y+")");
        addToCart.click();
        return new SearchProduct();
    }

    public String verifyHomePageTitle() {
        return driver.getTitle();
    }
}
