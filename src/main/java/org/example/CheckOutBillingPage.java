package org.example;

import org.openqa.selenium.By;

public class CheckOutBillingPage extends Utils {

     By _firstName = By.cssSelector("input#BillingNewAddress_FirstName");
     By _lastName = By.cssSelector("input#BillingNewAddress_LastName");
     By _email = By.cssSelector("input#BillingNewAddress_Email");
     By _country = By.cssSelector("select#BillingNewAddress_CountryId");
     By _city = By.cssSelector("input#BillingNewAddress_City");
     By _addLine1 = By.cssSelector("input#BillingNewAddress_Address1");
     By _postalCode = By.cssSelector("input#BillingNewAddress_ZipPostalCode");
     By _phoneNumber = By.cssSelector("input#BillingNewAddress_PhoneNumber");
     By _continueButton = By.xpath("//button[@onclick='Billing.save()']");
    public void  enterIngCheckoutBillingDetails()
    {
        //enter first name
        typeText(_firstName,"Mona");

        //enter last name
        typeText(_lastName,"patel");

        //enter email
        typeText(_email,"test@gmail.com");

        //select country from dropdown
        selectElementByValue(_country,"677");

        //type city name
        typeText(_city,"Wembley");

        //type 1st line of address
        typeText(_addLine1,"268, Estcoat Road");

        //type postal code
        typeText(_postalCode,"HA7 5hY");

        //type phone number
        typeText(_phoneNumber,"0709456732");

        //click on continue
        clickOnElement(_continueButton);





    }



}
