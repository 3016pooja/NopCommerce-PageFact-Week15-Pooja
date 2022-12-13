package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[1]/a")
    WebElement computer ;

   // By computer=By.xpath("//div[@class='header-menu']/ul[1]/li[1]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[2]/a")
    WebElement electronics ;
   // By electronics=By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[3]/a")
    WebElement apparel ;
   // By apparel=By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[4]/a")
    WebElement digitalDownloads ;
  //  By digitalDownloads=By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[5]/a")
    WebElement books ;
    //By books=By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[6]/a")
    WebElement jewelry ;
   // By jewelry=By.xpath("//div[@class='header-menu']/ul[1]/li[6]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[7]/a")
    WebElement giftCards ;
   // By giftCards=By.xpath("//div[@class='header-menu']/ul[1]/li[7]/a");


    public void clickOnComputer(){
        Reporter.log("click on Computer"+ computer.toString());
        clickOnElement(computer);
        CustomListeners.test.log(Status.PASS,"click on computer" );
    }
    public void clickOnElectronicsr(){
        Reporter.log("click on Electronic"+ electronics.toString());
        clickOnElement(electronics);
        CustomListeners.test.log(Status.PASS,"click on electronics" );
    }
    public void clickOnAppearals(){
        Reporter.log("click on apparel"+ apparel.toString());
        clickOnElement(apparel);
        CustomListeners.test.log(Status.PASS,"click on electronics" );
    }
    public void clickOndigitalDownloads(){
        Reporter.log("click on digiladownloads"+ digitalDownloads.toString());
        clickOnElement(digitalDownloads);
        CustomListeners.test.log(Status.PASS,"click on electronics" );
    }
    public void clickOnbooks(){
        Reporter.log("click on books"+ books.toString());
        clickOnElement(books);
        CustomListeners.test.log(Status.PASS,"click on books" );

    }
    public void clickOnJewelary(){
        Reporter.log("click on jewellary"+ jewelry.toString());
        clickOnElement(jewelry);
        CustomListeners.test.log(Status.PASS,"click on jewellary" );

    }
    public void clickOnGiftCards(){
        Reporter.log("click on giftcards"+ giftCards.toString());
        clickOnElement(giftCards);
        CustomListeners.test.log(Status.PASS,"click on giftcards" );

    }
    public String getUrl() {

        return driver.getCurrentUrl();
    }


}
