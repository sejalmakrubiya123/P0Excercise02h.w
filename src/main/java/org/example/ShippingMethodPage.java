package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShippingMethodPage extends Utils{

    String expectedOrderConfirmationMessage = "Order is not confirmed";
     By _nextDayAir = By.cssSelector("input#shippingoption_1");
     By _continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
     By _creditCard = By.cssSelector("input#paymentmethod_1");
     By _continueButtonCrdCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
     By _visa = By.cssSelector("select.dropdownlists");
     By _cardHolderName = By.cssSelector("input#CardholderName");
     By _cardNumber = By.cssSelector("input#CardNumber");
     By _expireMonth = By.cssSelector("select#ExpireMonth");
     By _expireYear = By.cssSelector("select#ExpireYear");
     By _cardCode = By.cssSelector("input#CardCode");
     By _continueButton3 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
     By _confirmButton = By.xpath("//button[text()='Confirm']");
     By _orderSuccessfullyMessage = By.xpath("//div[@class='section order-completed']//div[@class='title']");
     By _orderNumber = By.xpath("//div[@class='order-number']");
    public void clickOnShippingMethod(){

        //click on next day air radio button
        clickOnElement(_nextDayAir);

        //click on continue button
        clickOnElement(_continueButton);

        //click on credit card radio button
        clickOnElement(_creditCard);

        //click on continue button
        clickOnElement(_continueButtonCrdCard);



    }
    public void paymentMethod(){

        //select visa card type
        selectElementByText(_visa,"Visa");

        //type cardholder name
        typeText(_cardHolderName,"HetalPatel");

        //type card number
        typeText(_cardNumber,"4026003185287926");

        //select expiry month
        selectElementByValue(_expireMonth,"8");

        //select expiry year
        selectElementByValue(_expireYear,"2028");

        //type card code
        typeText(_cardCode,"318");

        //click on continue
        clickOnElement(_continueButton3);


    }
    public void confirmOrder(){

        //click on confirm button
        clickOnElement(_confirmButton);

        //verify and assert order is successful message
        String orderSuccessfullyMessage = getTextFromElement(_orderSuccessfullyMessage);
        System.out.println("Order Details: " +orderSuccessfullyMessage);
        //print order no.
        String orderNumber = getTextFromElement(_orderNumber);
        System.out.println(orderNumber);
        Assert.assertEquals(orderSuccessfullyMessage,expectedOrderConfirmationMessage,"Order is not processed");


    }



}
