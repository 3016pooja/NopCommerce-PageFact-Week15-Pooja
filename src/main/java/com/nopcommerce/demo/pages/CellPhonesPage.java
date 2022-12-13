package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyCellPhones ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView ;

    @CacheLookup
    @FindBy(xpath = "//div[@class='picture']//img[@title='Show details for Nokia Lumia 1020']")
    WebElement nokiaLumia ;

    public void clickOnNokiaLumia(){
        Reporter.log("verift the texy paymentcard "+ nokiaLumia.toString());
        clickOnElement(nokiaLumia);
    }

    public String getVerifyCellPhones(){
        Reporter.log("verift the texy paymentcard "+ verifyCellPhones.toString());
        return getTextFromElement(verifyCellPhones);
    }

    public void clickListView(){
        Reporter.log("verift the texy paymentcard "+ listView.toString());

        clickOnElement(listView);
    }
}
