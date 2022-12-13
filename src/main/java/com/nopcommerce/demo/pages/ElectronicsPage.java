package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]")
    WebElement cellPhones ;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellphonesText ;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewclick ;
    //By listViewclick = By.xpath("//a[contains(text(),'List')]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[1]")
    WebElement nonokiaProduct ;


    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement priceText ;
    //By priceText = By.xpath("//span[@id='pri-20']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changQnty ;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addtoCart ;
    //By addtoCart = By.xpath("//button[@id='add-to-cart-button-20']");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement addtoCartText ;
   // By addtoCartText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeBar ;
    //By closeBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart ;
   // By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart ;
    //By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement ShoppingCartText ;
   // By ShoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]")
    WebElement priceText1 ;
    //By priceText1 = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    @CacheLookup
    @FindBy(xpath= "//input[@id='termsofservice']")
    WebElement agreeButton ;
   // By agreeButton = By.xpath("//input[@id='termsofservice']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement chekoutButton ;
   // By chekoutButton = By.xpath("//button[@id='checkout']");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText ;
   // By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerButton ;
   // By registerButton = By.xpath("//button[contains(text(),'Register')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText ;
    //By registerText = By.xpath("//h1[contains(text(),'Register')]");
    @CacheLookup
    @FindBy(name = "FirstName")
    WebElement firstName ;
    //By firstName = By.name("FirstName");
    @CacheLookup
    @FindBy(name = "LastName")
    WebElement lastNmae ;
   // By lastNmae = By.name("LastName");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailId ;
    //By emailId = By.id("Email");
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password ;
   // By password = By.id("Password");
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword ;
   // By confirmPassword = By.id("ConfirmPassword");
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton1 ;
   // By registerButton1 = By.xpath("//button[@id='register-button']");
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerText1 ;
   // By registerText1 = By.xpath("//div[contains(text(),'Your registration completed')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement onContinueTab ;
   // By onContinueTab = By.xpath("//a[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement iagreebutton ;
  //  By iagreebutton = By.xpath("//input[@id='termsofservice']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut2 ;
   // By checkOut2 = By.xpath("//button[@id='checkout']");
    @CacheLookup
    @FindBy(name = "BillingNewAddress.CountryId")
    WebElement countryNmae ;
   // By countryNmae = By.name("BillingNewAddress.CountryId");
    @CacheLookup
    @FindBy(name = "BillingNewAddress.City")
    WebElement city ;
   // By city = By.name("BillingNewAddress.City");
    @CacheLookup
    @FindBy(name = "BillingNewAddress.Address1")
    WebElement address ;
   // By address = By.name("BillingNewAddress.Address1");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postOcde ;
   // By postOcde = By.id("BillingNewAddress_ZipPostalCode");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber ;
   // By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continue3 ;
   // By continue3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement radiosecondDay ;
   // By radiosecondDay = By.xpath("//input[@id='shippingoption_2']");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement continue4 ;
   // By continue4 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement paymentMethod ;
   // By paymentMethod = By.xpath("//input[@id='paymentmethod_1']");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement creditCardMethod ;
   // By creditCardMethod = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    @CacheLookup
    @FindBy(xpath = "//select[@class='dropdownlists']")
    WebElement visa ;

   // By visa = By.xpath("(//select[@id='CreditCardType']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderNameNokia ;
   // By cardHolderNameNokia = By.xpath("//input[@id='CardholderName']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberNokia ;
   // By cardNumberNokia = By.xpath("//input[@id='CardNumber']");
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expiryMonthNokia ;
    //By expiryMonthNokia = By.xpath("//select[@id='ExpireMonth']");
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expiryYearNokia ;
   // By expiryYearNokia = By.xpath("//select[@id='ExpireYear']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeNokia ;
    //By cardCodeNokia = By.xpath("//input[@id='CardCode']");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueCheckoutNokia ;
   // By continueCheckoutNokia = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement creditCaedText ;
   // By creditCaedText = By.xpath("//span[contains(text(),'Credit Card')]");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shipping Method:')]")
    WebElement ShippingMethodText ;
   // By ShippingMethodText = By.xpath("//span[contains(text(),'Shipping Method:')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confrimClick ;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankyouText ;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement yourOrderSucessfullText ;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continue5 ;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcometoOurStore ;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutLink2 ;
//By logoutLink2=By.xpath("//a[@class='ico-logout']");
    // Mouse Hover on “Cell phones” and click
    public void mouseHoverOnCellPhone() {
        Reporter.log("click on login button"+ cellPhones.toString());
        clickOnElement(cellPhones);
    }

    public void clickonCellPhonesoptin() {
        Reporter.log("click on cell phone button"+ cellPhones.toString());
        clickOnElement(cellPhones);
    }

    //2.3	Verify the text “Cell phones”
    public String verifytextCellPhones() {
        Reporter.log("verift the cell phone "+ cellphonesText.toString());
        String message=getTextFromElement(cellphonesText);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;

    }

    //2.4	Click on List View Tab
    public void clickOnlistView() {
        Reporter.log("click on the list view "+ listViewclick.toString());
        clickOnElement(listViewclick);
    }

    //2.5	Click on product name “Nokia Lumia 1020” link
    public void clickOnNokia() {
        try {
            clickOnElement(nonokiaProduct);

        } catch (StaleElementReferenceException ignored) {

        }
        clickOnElement(nonokiaProduct);
    }

    public String verifytextofPrice() {
        Reporter.log("verift the to price"+ priceText.toString());
        String message=getTextFromElement(priceText);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;

    }

    //Change quantity to 2
    public void SendTexttochangeQuntity() {
        Actions actions1 = new Actions(driver);
        WebElement quntity = driver.findElement((By) changQnty);
        quntity.clear();
        sendTextToElement(changQnty, "2");
    }

    //2.9Click on “ADD TO CART” tab
    public void clickOnAddtoCart() {
        Reporter.log("click on login button"+ addtoCart.toString());
        clickOnElement(addtoCart);
    }

    //2.10	Verify the Message "The product has been added to your shopping cart" on Top green Bar
    public String verifytextProdutAddedToCart() {
        Reporter.log("verift the product added to cart "+ addtoCartText.toString());
        String message=getTextFromElement(addtoCartText);
        CustomListeners.test.log(Status.PASS,"verift the product added to cart" );
        return message;

    }

    public void clickOnCloseTheBar() {
        Reporter.log("click on the close bar "+ closeBar.toString());
        clickOnElement(closeBar);
    }

    //2.11	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mousehpveronShopingCart() {
        Reporter.log("click on the shopping cart button "+ shoppingCart.toString());
        mouseHoverToElementAndClick(shoppingCart);
    }

    public void mouseHvoerOngoToCart() {
        Reporter.log("click on the on go to  cart button "+ goToCart.toString());
        clickOnElement(goToCart);
    }

    public String verifyShoppingcartText() {
        Reporter.log("verify the test shopping cart "+ ShoppingCartText.toString());
        return getTextFromElement(ShoppingCartText);
    }

    public String verifyPriceText() {
        Reporter.log("verify the text price "+ priceText1.toString());
        return getTextFromElement(priceText1);
    }

    //2.15	click on checkbox “I agree with the terms of service”
    public void clickOnAgreeTermsandServicesr() {
        Reporter.log("verify the text price "+agreeButton .toString());
        clickOnElement(agreeButton);
    }

    public void clickOnChekout() {
        Reporter.log("click on checkout button"+ chekoutButton.toString());
        clickOnElement(chekoutButton);
        CustomListeners.test.log(Status.PASS,"chekout button" );

    }

    //2.17	Verify the Text “Welcome, Please Sign In!”
    public String verifyWelcomeSignIn() {
        Reporter.log("verify welcome sign in"+ welcomeText.toString());
        String message= getTextFromElement(welcomeText);
        CustomListeners.test.log(Status.PASS,"welcom sign in" );
        return message;
    }


    public void clickOnRegister() {
        Reporter.log("click on register"+ registerButton.toString());
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS,"register" );
    }


    public String verifyRegisterText() {
        Reporter.log("verify register text "+ registerText.toString());
        String message= getTextFromElement(registerText);
        CustomListeners.test.log(Status.PASS,"register text" );
        return message;

    }


    public void sentTextToFirstName(String frnam) {
        Reporter.log("Enter username to the  field"+frnam+firstName .toString());
        sendTextToElement(firstName,frnam);
        CustomListeners.test.log(Status.PASS,"Enter username" );
    }

    public void sentTextToLastName(String lasnam) {
        Reporter.log("Enter username to the  field"+lasnam+lastNmae .toString());
        sendTextToElement(lastNmae, lasnam);
        CustomListeners.test.log(Status.PASS,"Enter username" );
    }

    public void sentTextToEmailId(String email) {
        Reporter.log("Enter email to the  field"+email+emailId .toString());
        sendTextToElement(emailId,email);
        CustomListeners.test.log(Status.PASS,"Enter username" );
    }

    public void sentTextToPassword(String passwrd) {
        Reporter.log("Enter password to the  field"+passwrd+password .toString());
        sendTextToElement(password, passwrd);
        CustomListeners.test.log(Status.PASS,"Enter username" );

    }
    public void sentTextToconfirmPassword(String cfmpsw) {
        Reporter.log("Enter confirmpasswprd to the  field"+cfmpsw+confirmPassword .toString());
        sendTextToElement(confirmPassword,cfmpsw);
        CustomListeners.test.log(Status.PASS,"confirm password" );


    }
    public void clickonRegisterButton1() {
        Reporter.log("click on register button"+ registerButton1.toString());
        clickOnElement(registerButton1);
    }

    //2.22	Verify the message “Your registration completed”
    public String verifytextyourRegistrationcompleted() {
        Reporter.log("verift your registratoion completed"+ registerText1.toString());
        String message=getTextFromElement(registerText1);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;
    }
    //2.23	Click on “CONTINUE” tab

    public void clickonContinueButton1() {
        Reporter.log("click on continue button"+ onContinueTab.toString());
        clickOnElement(onContinueTab);
    }

    //click on checkbox “I agree with the terms of service”
    public void clickonCheckBoxIagree() {
        Reporter.log("click on check box i agree button"+ iagreebutton.toString());
        clickOnElement(iagreebutton);
    }

    // /2.26Click on “CHECKOUT”
    public void clickonChekoutButton2() {
        Reporter.log("click on chech out button"+ checkOut2.toString());
        clickOnElement(checkOut2);
    }

    //2.27	Fill the Mandatory fields
    public void enterCountryName(String country) {
        Reporter.log("Enter nation to the  field"+country+ countryNmae.toString());
        selectByVisibleTextFromDropDown(countryNmae,country);
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }

    public void enterCityName(String town) {
        Reporter.log("Enter cityname to the  field"+town+ city.toString());
        sendTextToElement(city, "Bareli");
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );

    }

    public void enterResidanceAddress(String addr) {
        Reporter.log("Enter address to the  field"+addr+ address.toString());
        sendTextToElement(address, addr);
        CustomListeners.test.log(Status.PASS,"address" );

    }

    public void enterZipcodeofArea(String zipcod) {
        Reporter.log("Enter zipcode to the  field"+zipcod+ postOcde.toString());
        sendTextToElement(postOcde,zipcod);
        CustomListeners.test.log(Status.PASS,"address" );

    }

    public void enterPhoneNumber(String num) {
        Reporter.log("Enter phonenumber to the  field"+num+ phoneNumber.toString());
        sendTextToElement(phoneNumber, num);
        CustomListeners.test.log(Status.PASS,"address" );

    }

    public void clickONContinue3() {
        Reporter.log("Enter zipcode to the  field"+ continue3.toString());
        clickOnElement(continue3);
    }
    public void clickOn2ndDayButton() {
        Reporter.log("Enter zipcode to the  field"+ radiosecondDay.toString());
        clickOnElement(radiosecondDay);
    }
    public void clickONContinue4() {
        Reporter.log("Enter zipcode to the  field"+continue4 .toString());
        clickOnElement(continue4);
    }

    public void clickOnPaymentMethodField() {
        Reporter.log("Enter zipcode to the  field"+paymentMethod .toString());
        clickOnElement(paymentMethod);
    }

    public void clickOnMethodCreditCard() {
        Reporter.log("Enter zipcode to the  field"+creditCardMethod .toString());
        clickOnElement(creditCardMethod);
    }
    public void selectVisa(String vs) {
        Reporter.log("select visa"+vs+visa .toString());
        selectByVisibleTextFromDropDown(visa, "Master card");
       // selectByVisibleTextFromDropDown(visa,vs);
    }
    public void enterCardHolderNameNokia(String cardnam) {
        Reporter.log("Enter username to the  field"+cardnam+ cardHolderNameNokia.toString());
        sendTextToElement(cardHolderNameNokia, "Mr rohit shett");
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );

    }

    public void enterCardNumberNokia(String crnum) {
        Reporter.log("Enter username to the  field"+crnum+ cardNumberNokia.toString());
        sendTextToElement(cardNumberNokia, crnum);
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }

    public void enterExpiryMonthNokia(String exp) {
        Reporter.log("Enter expiry month to the  field"+exp+ expiryMonthNokia.toString());
        selectByVisibleTextFromDropDown(expiryMonthNokia, "01");
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }

    public void enterExpiryYearNokia(String exyear) {
        Reporter.log("Enter expiry year to the  field"+exyear+ expiryYearNokia.toString());
        selectByVisibleTextFromDropDown(expiryYearNokia, "2025");
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }

    public void enterCardCodeNokia(String cod) {
        Reporter.log("Enter expiry year to the  field"+cod+ cardCodeNokia.toString());
        sendTextToElement(cardCodeNokia, "999");
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }
    public void clickOnContinueCheckoutNokia() {
        Reporter.log("click on continue check out button"+continueCheckoutNokia .toString());
        clickOnElement(continueCheckoutNokia);
        CustomListeners.test.log(Status.PASS,"click on login button" );
    }



    public String verifycreditCardMethod() {
        Reporter.log("verift the card method "+ creditCaedText.toString());
        String message=getTextFromElement(creditCaedText);
        CustomListeners.test.log(Status.PASS,"card number" );
        return message;
    }

    //Verify “Shipping Method” is “2nd Day Air”
    public String verif2ndDayAirMethod() {
        Reporter.log("verift 2nd day air method "+ ShippingMethodText.toString());
        String message=getTextFromElement(ShippingMethodText);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;

    }

    public void clickOnConfirmButton2() {
        Reporter.log("click on confirm button "+ confrimClick.toString());
        clickOnElement(confrimClick);
    }

    //2.39	Verify the Text “Thank You”
    public String verifThankYouText() {
        Reporter.log("verift the thank you text "+ thankyouText.toString());
        String message=getTextFromElement(thankyouText);
        CustomListeners.test.log(Status.PASS,"thank you" );
        return message;

    }

    //2.40	Verify the message “Your order has been successfully processed!”
    public String verifYourOrderSucessfullyPlaced() {
        Reporter.log("verift your order sucessfully  "+ yourOrderSucessfullText.toString());
        String message=getTextFromElement(yourOrderSucessfullText);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;

    }
    //2.41	Click on “CONTINUE”
    public void clickOnContinueButton5() {
        Reporter.log("click on continue button  "+ continue5.toString());
        clickOnElement(continue5);
    }
    //2.42	Verify the text “Welcome to our store”
    public String verifWelcomeToOurStorePage() {
        Reporter.log("verift welcome to our store  "+ welcometoOurStore.toString());
        String message=getTextFromElement(welcometoOurStore);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;

    }
    //Click on “Logout” link
    public void clickOnLogOutLink2(){
        Reporter.log("click on log out link "+ logoutLink2.toString());
        clickOnElement(logoutLink2);
    }
    //verify url:

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
