package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumiaPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement verifyNokiaLumia ;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),' $349.00 ')]")
    WebElement verifyPrice ;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changeQuantity2 ;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart ;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyProductAdded ;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeAlert ;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart ;



    public String getVerifyNokiaLumia() {
        Reporter.log("verift the product nokialumia "+ verifyNokiaLumia.toString());
        String message=getTextFromElement(verifyNokiaLumia);
        CustomListeners.test.log(Status.PASS,"verift the product added to cart" );
        return message;

    }

    public String getVerifyPrice() {
        Reporter.log("verify the product price "+ verifyPrice.toString());
        String message=getTextFromElement(verifyPrice);
        CustomListeners.test.log(Status.PASS,"price" );
        return message;

    }

    public void sendChangeQuantity2(String chng) {
        Reporter.log("verify the product price "+ chng+ changeQuantity2.toString());
        sendTextToElement(changeQuantity2, Keys.BACK_SPACE + "2");
    }

    public void clickAddToCart() {
        Reporter.log("verify the product price "+ addToCart.toString());
        clickOnElement(addToCart);
    }

    public String getVerifyProductAdded() {
        Reporter.log("verify the product price "+ verifyProductAdded.toString());
        String message=getTextFromElement(verifyProductAdded);
        CustomListeners.test.log(Status.PASS,"price" );
        return message;

    }

    public void clickCloseAlert() {
        Reporter.log("verify the product price "+ closeAlert.toString());
        clickOnElement(closeAlert);
    }

    public void clickShoppingCart() {
        Reporter.log("verify the product price "+ shoppingCart.toString());
        clickOnElement(shoppingCart);
    }
}
