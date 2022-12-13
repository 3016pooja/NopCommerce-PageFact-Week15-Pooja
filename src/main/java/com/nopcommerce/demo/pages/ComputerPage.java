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
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement desktop ;
    //By desktop = By.xpath("//h2[@class='title']//a");

    @CacheLookup
    @FindBy(name = "products-orderby")
    WebElement nameZtoA ;
    //By nameZtoA = By.name("products-orderby");
    @CacheLookup
    @FindBy(className = "product-title")
    WebElement verifyProductsArranged ;
    // By verifyProductsArranged = By.className("product-title");
    //@CacheLookup
   // @FindBy(xpath = "//button[@type='button'][normalize-space()='Add to cart'])[1]")
    //WebElement buildYourOwnComputer;
    //By buildYourOwnComputer = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCartButton ;
    //By addToCartButton=By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComTxt ;
    //By buildYourOwnComTxt=By.xpath("//h1[contains(text(),'Build your own computer')]");

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement dualCoreFunctionality ;
    //By dualCoreFunctionality=By.name("product_attribute_1");
    @CacheLookup
    @FindBy(name = "product_attribute_2")
    WebElement gbRamFunctionality ;
    // By gbRamFunctionality=By.name("product_attribute_2");
    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_3_7']")
    WebElement hDDRadio ;
    //By hDDRadio=By.xpath("//label[@for='product_attribute_3_7']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement vistaPremium ;
    //By vistaPremium=By.xpath("//input[@id='product_attribute_4_9']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement microsoftOffice ;
    // By microsoftOffice=By.xpath("//input[@id='product_attribute_5_12']");

    @CacheLookup
    @FindBy(xpath = "//span[text()='$1,475.00']")
    WebElement priceText ;
    // By priceText=By.xpath("//span[text()='$1,475.00']");

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart ;
    // By addToCart=By.xpath("//button[@id='add-to-cart-button-1']");

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedToYourCartTxt ;
    //By productAddedToYourCartTxt=By.xpath("//p[@class='content']");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart ;
    //By shoppingCart=By.xpath("//a[contains(text(),'shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart ;
    //By goToCart=By.xpath("//button[contains(text(),'Go to cart')]");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartTxr ;
    // By shoppingCartTxr=By.xpath("//h1[contains(text(),'Shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement quntityField ;
    //By quntityField=By.xpath("//input[@value='1']");
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCart ;
    //By updateCart=By.xpath("//button[@id='updatecart']");
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[4]/td[2]")
    WebElement totalText ;
    //  By totalText=By.xpath("//tbody/tr[4]/td[2]");
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkboxButton ;
    //By checkboxButton=By.xpath("//input[@id='termsofservice']");

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut ;
    //By checkOut=By.xpath("//button[@id='checkout']");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')")
    WebElement welcomeSignInText ;
    //By welcomeSignInText=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkoutAsGuest ;
    // By checkoutAsGuest=By.xpath("//button[contains(text(),'Checkout as Guest')]");

    @CacheLookup
    @FindBy(name = "BillingNewAddress.FirstName")
    WebElement firstNameField ;
    // By firstNameField=By.name("BillingNewAddress.FirstName");

    @CacheLookup
    @FindBy(name = "BillingNewAddress.LastName")
    WebElement lastNameField ;
    // By lastNameField=By.name("BillingNewAddress.LastName");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailIdFiedl ;
    // By emailIdFiedl=By.id("BillingNewAddress_Email");
    @CacheLookup
    @FindBy(name= "BillingNewAddress.CountryId")
    WebElement counrtyNameField ;
    //By counrtyNameField=By.name("BillingNewAddress.CountryId");


    @CacheLookup
    @FindBy(name = "BillingNewAddress.City")
    WebElement cityNameFiled ;
    //By cityNameFiled=By.name("BillingNewAddress.City");

    @CacheLookup
    @FindBy(name = "BillingNewAddress.Address1")
    WebElement addressField ;
    //By addressField=By.name("BillingNewAddress.Address1");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postcodeField ;
    //By postcodeField=By.id("BillingNewAddress_ZipPostalCode");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber ;
    //By phoneNumber=By.id("BillingNewAddress_PhoneNumber");
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton1 ;
    //By continueButton1=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Next Day Air ($0.00)')]")
    WebElement nextDayRadioButton ;
    //By nextDayRadioButton=By.xpath("//label[contains(text(),'Next Day Air ($0.00)')]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement continue2 ;
    // By continue2=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard ;
    // By creditCard=By.xpath("//input[@id='paymentmethod_1']");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement selectCreditCard1 ;
    //By selectCreditCard1=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardType ;
    // By creditCardType=By.xpath("//select[@id='CreditCardType']");

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Master card')]")
    WebElement mastercardTye ;
    //By mastercardTye=By.xpath("//option[contains(text(),'Master card')]");

    @CacheLookup
    @FindBy(name = "CardholderName")
    WebElement cardHolderName ;
    // By cardHolderName=By.name("CardholderName");
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber ;
    // By cardNumber=By.id("CardNumber");
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth ;
    //By expireMonth=By.id("ExpireMonth");
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear ;
    //By expireYear=By.id("ExpireYear");
    @CacheLookup
    @FindBy(xpath= "//input[@id='CardCode']")
    WebElement cardCode ;
    // By cardCode=By.id("CardCode");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement continue3 ;
    // By continue3=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement paymentMethodText ;
    // By paymentMethodText=By.xpath("//li[@class='payment-method']");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]")
    WebElement shippingMethodText ;
    //By shippingMethodText=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]");
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]")
    WebElement totalpriceText2 ;
    // By totalpriceText2=By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton ;
    //By confirmButton=By.xpath("//button[contains(text(),'Confirm')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankyouText ;
    //  By thankyouText=By.xpath("//h1[contains(text(),'Thank you')]");
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement sucessfullMessage ;
    //By sucessfullMessage=By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continue5 ;
    // By continue5=By.xpath("//button[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement wecometoOurSotreTexy ;
    // By wecometoOurSotreTexy=By.xpath("//h2[contains(text(),'Welcome to our store')]");


    public void clickonDesktop() {
        Reporter.log("click on the desktop"+desktop.toString());
        clickOnElement(desktop);
        CustomListeners.test.log(Status.PASS,"desktop" );
    }

    public void sortByPositionZtoA(String value) {
        Reporter.log("sort by z to A postiton "+value+nameZtoA.toString());
        selectByValueFromDropDown(nameZtoA,value);
        CustomListeners.test.log(Status.PASS," z to A postiton " );
    }
    // 1.4	Verify the Product will arrange in Descending order.
    public String verifyProductsArrangeDescendingOrder() {
        return getTextFromElement(verifyProductsArranged);
      //  System.out.println("The number of products on page are:" + driver.findElements(verifyProductsArranged).size());
    }
//2.3	Select Sort By
//2.4	position "Name: A to Z"
public void sortByPositionAtoZ(String atoz) {
    Reporter.log("sort by z to A postiton "+atoz+nameZtoA.toString());
    selectByValueFromDropDown(nameZtoA,atoz);
    CustomListeners.test.log(Status.PASS," a to z postiton " );

}

    public void verifyDescendingOrder(){
        List<WebElement> product = driver.findElements(By.className("product-title"));
        ArrayList<String> beforeFilterProductList = new ArrayList<>();
        for (WebElement element : product) {
            beforeFilterProductList.add(element.getText());
        }

        Collections.reverse(beforeFilterProductList);
        //1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"),"Name: Z to A");
        //After filter get product list
        product = driver.findElements(By.className("product-title"));
        ArrayList<String> afterFilterProductList = new ArrayList<>();
        for (WebElement element : product) {
            afterFilterProductList.add(element.getText());
        }
        Collections.reverse(afterFilterProductList);
        Assert.assertEquals(beforeFilterProductList, afterFilterProductList);
    }

//  2.5	Click on "Add To Cart"
//public void clickBuildYourOwnComputer () {
   // Reporter.log("click on add to cart button"+ buildYourOwnComputer.toString());

    //clickOnElement(buildYourOwnComputer);

    public void clickOnAddToCart() {
        try {
            Reporter.log("click on add to cart button"+ addToCartButton.toString());
            clickOnElement(addToCartButton);
        } catch (
                StaleElementReferenceException e) {
            Reporter.log("click on add to cart button"+ addToCartButton.toString());
            clickOnElement(addToCartButton);
        }
    }
           // 2.6	Verify the Text "Build your own computer"
    public String verifyBuildyourowncomputerText(){
        Reporter.log("verift the text build your own computer"+ buildYourOwnComTxt.toString());
        String message=getTextFromElement(buildYourOwnComTxt);
        CustomListeners.test.log(Status.PASS,"build your own computer" );
        return message;
    }
            //2.7	Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void selectDualCoreE2200(String core){
        Reporter.log("verift the functionality"+ core+dualCoreFunctionality.toString());
        selectByValueFromDropDown(dualCoreFunctionality,core);
    }

//2.7.Select "8GB [+$60.00]" using Select class.
public void select8GbFunctionality(String ram){
    Reporter.log("verift the functionality"+ gbRamFunctionality.toString());
    selectByValueFromDropDown(gbRamFunctionality,ram);
}
//2.8	Select HDD radio "400 GB [+$100.00]"2.8	Select HDD radio "400 GB [+$100.00]"
public void selectHddRadioOption(){
    Reporter.log("click on hdd radio"+ hDDRadio.toString());
    clickOnElement(hDDRadio);
}
// 2.9	Select OS radio "Vista Premium [+$60.00]"
public void selectVistaPremiumOption(){
    Reporter.log("click on vistapremium"+ vistaPremium.toString());
    clickOnElement(vistaPremium);
}
// 2.10	Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
public void clickonMicrosoftOfficeOption(){
    Reporter.log("click on the microsoftoffice"+microsoftOffice.toString());
    clickOnElement(microsoftOffice);
    CustomListeners.test.log(Status.PASS,"microsoftoffice" );

}
           // 2.11	Verify the price "$1,475.00"
           public String verifyPriceText(){
               Reporter.log("verift the price text"+ priceText.toString());
               String message=getTextFromElement(priceText);
               CustomListeners.test.log(Status.PASS,"price text" );
               return message;
           }

    // 2.12 Click on "ADD TO CARD" Button.
    public void clickonAddtoCardButton() {
        Reporter.log("verift the price text"+ priceText.toString());
        clickOnElement(addToCart);
    }

//2.13	Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.
public String verifyProcductAddedToCart(){
    Reporter.log("verift the product added to your cart"+ productAddedToYourCartTxt.toString());
    String message=getTextFromElement(productAddedToYourCartTxt);
    CustomListeners.test.log(Status.PASS,"Enter username" );
    return message;
}
// 2.14	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mouseHoverOnShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        WebElement shopping=driver.findElement((By) shoppingCart);
        WebElement goToCard=driver.findElement((By) goToCart);
        Actions actions1=new Actions(driver);
        actions1.moveToElement(shopping).moveToElement(goToCard).click().build().perform();
    }
    public void mouseHoverOnGoToCart(){
        Reporter.log("Enter username to the  field"+shoppingCart.toString());
        clickOnElement(shoppingCart);
    }

    //2.15 verify the message'Shopping cart'.
    public String verifyMessageShoppingCart() {
        Reporter.log("verift the text shopping cart"+ shoppingCartTxr.toString());
        String message=getTextFromElement(shoppingCartTxr);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;
    }
    //2.16	Change the Qty to "2" and Click on "Update shopping cart"
    public void ChangeQuntity(String qty) {
        Reporter.log("verift the text  price text"+ quntityField.toString());
        quntityField.clear();
        sendTextToElement(quntityField, qty);
        clickOnElement(updateCart);

    }
    public String verifyTotalPriceText() {
        Reporter.log("verift the text  price text"+ totalText.toString());
        String message=getTextFromElement(totalText);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;
    }
    public void clickOnCheckBoxTick(){
        Reporter.log("click on check box"+ checkboxButton.toString());
        clickOnElement(checkboxButton);
    }
           public void clickOnCheckOutButton(){
               Reporter.log("click on checkout box"+ checkOut.toString());
               clickOnElement(checkOut);
           }

    public String verifyWelcomSignInText() {
        return getTextFromElement(welcomeSignInText);
    }
           // 2.21Click on “CHECKOUT AS GUEST” Tab
           public void clickOnCheckOutAsGuestButton(){
               Reporter.log("click on chekout as guest box"+ checkoutAsGuest.toString());
               clickOnElement(checkoutAsGuest);
           }
             //2.22	Fill the all mandatory field
    public void sendTextToFirstName(String frnm){
        Reporter.log("Enter first name to the  field"+frnm+ firstNameField.toString());
        sendTextToElement(firstNameField,frnm);
        CustomListeners.test.log(Status.PASS,"Enter validpassword" );
    }
    public void sendTextToLastName(String lasnm){
        Reporter.log("Enter last name to the  field"+lasnm+ lastNameField.toString());
        sendTextToElement(lastNameField,lasnm);
        CustomListeners.test.log(Status.PASS,"Enter validpassword" );
    }
    public void sendTextToEmailIdField(String eml){
        Reporter.log("Enter email to the  field"+eml+ emailIdFiedl.toString());
        sendTextToElement(emailIdFiedl,eml);
        CustomListeners.test.log(Status.PASS,"Enter validpassword" );
    }
    public void sendTextToCountryField(String cntry){
        Reporter.log("Enter country name to the  field"+cntry+counrtyNameField .toString());
        selectByVisibleTextFromDropDown(counrtyNameField,cntry);
        CustomListeners.test.log(Status.PASS,"Enter validpassword" );
    }

    public void sendTextToCityField(String twn){
        Reporter.log("Enter city name to the  field"+twn+cityNameFiled .toString());
        sendTextToElement(cityNameFiled,twn);
        CustomListeners.test.log(Status.PASS,"Enter validpassword" );

    }
    public void sendTextToAdressField(String socity){
        Reporter.log("Enter city name to the  field"+socity+addressField .toString());
        sendTextToElement(addressField,socity);
        CustomListeners.test.log(Status.PASS,"Enter validpassword" );
    }
    public void sendTextToZipCodeField(String pscd){
        Reporter.log("Enter zipcode name to the  field"+pscd+postcodeField .toString());
        sendTextToElement(postcodeField,pscd);
        CustomListeners.test.log(Status.PASS,"Enter validpassword" );
    }
    public void sendTextToPhoneNumberField(String phnu){
        Reporter.log("Enter phone number to the  field"+phnu+phoneNumber .toString());
        sendTextToElement(phoneNumber,phnu);
        CustomListeners.test.log(Status.PASS,"Enter validpassword" );
    }
    public void clickOnCountinueButton1(){
        Reporter.log("click on continue button"+continueButton1 .toString());
        clickOnElement(continueButton1);
    }
            //2.24	Click on Radio Button “Next Day Air($0.00)”
            public void clickOnNextDayButton(){
                Reporter.log("click on continue button"+nextDayRadioButton .toString());
                clickOnElement(nextDayRadioButton);
            }
           // 2.25	Click on “CONTINUE”
           public void clickOnCountinueButton2(){
               Reporter.log("click on continue button"+continue2 .toString());
               clickOnElement(continue2);
           }
           // 2.26	Select Radio Button “Credit Card”
    public void clickOnCreditCardRadioButton(){
        Reporter.log("click on continue button"+creditCard .toString());
        clickOnElement(creditCard);
    }
    public void selectcreditCardRadioButton2(){
        Reporter.log("click on continue button"+selectCreditCard1 .toString());
        clickOnElement(selectCreditCard1);
    }
            //2.27	Select “Master card” From Select credit card dropdown
            public void clickOnCreditCardfromTheOption(){
                Reporter.log("click credit card button"+creditCardType .toString());
                clickOnElement(creditCardType);
            }
    public void selectMasterCardTye(){
        Reporter.log("click on mastercard type button"+mastercardTye .toString());
        clickOnElement(mastercardTye);
    }
//2.28Fill all the details
    public void sendTxtToCrdHolderName(String crnam){
        Reporter.log("Enter username to the  field"+crnam+ cardHolderName.toString());
        sendTextToElement(cardHolderName,crnam);
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }
    public void sendTxtToCardNumber(String cnumber){
        Reporter.log("Enter card number to the  field"+cnumber+ cardNumber.toString());
        sendTextToElement(cardNumber,"0245 0245 0654 0587");
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }
    public void sendTxtToExpireMonth(String holdrnam){
        Reporter.log("Enter expire month to the  field"+holdrnam+ expireMonth.toString());
        selectByVisibleTextFromDropDown(expireMonth,"08");
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }
    public void sendTxtToExpireYearr(String expyear){
        Reporter.log("Enter username to the  field"+expyear+ expireYear.toString());
        selectByVisibleTextFromDropDown(expireYear,"2024");
        CustomListeners.test.log(Status.PASS,"Enter Invalidusername" );
    }
    public void sendTxtToCardCodeCvv(String cvvnum) {
        Reporter.log("Enter cvv number to the  field" + cvvnum + cardCode.toString());
        sendTextToElement(cardCode,cvvnum);
        CustomListeners.test.log(Status.PASS, "Enter Invalidusername");

    }
    public void clickOnContinue3(){
        Reporter.log("click on continue" + continue3 .toString());
        clickOnElement(continue3);
    }
    // 2.30Verify “Payment Method” is “Credit Card”
    public String verifyPaymentMethodCreditCar(){
        Reporter.log("verift the texy paymentcard "+ paymentMethodText.toString());
        String message=getTextFromElement(paymentMethodText);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;
    }
    //Verify “Shipping Method” is “Next Day Air”
    public String verifyShippingMethodText(){
        Reporter.log("verift the text shipping method"+ shippingMethodText.toString());
        String message=getTextFromElement(shippingMethodText);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;
    }
    public String verifyPricetext2(){
        Reporter.log("verift the text price"+ totalpriceText2.toString());
        String message=getTextFromElement(totalpriceText2);
        CustomListeners.test.log(Status.PASS,"Enter username" );
        return message;
    }
    //2.34	Click on “CONFIRM”
    public void clickOnConfirmButton4(){
        Reporter.log("click on confirm button "+ confirmButton.toString());
        clickOnElement(confirmButton);
    }
//2.35Verify the Text “Thank You”
public String verifyThankyouText(){
    Reporter.log("verift the thankyou text"+ thankyouText.toString());
    String message=getTextFromElement(thankyouText);
    CustomListeners.test.log(Status.PASS,"Enter username" );
    return message;
}
 public String verifyYourOrderProcced(){
               Reporter.log("verift the sucessfull text"+ sucessfullMessage.toString());
               String message=getTextFromElement(sucessfullMessage);
               CustomListeners.test.log(Status.PASS,"Enter username" );
               return message;
           }

public void clickonFinalContinue(){
    Reporter.log("click on continue button"+ continue5.toString());
    clickOnElement(continue5);
}
            public String verifyWelcomtoOurStore(){
                Reporter.log("verift the welcome to our stor text"+ wecometoOurSotreTexy.toString());
                String message=getTextFromElement(wecometoOurSotreTexy);
                CustomListeners.test.log(Status.PASS,"Enter username" );
                return message;
            }

}
