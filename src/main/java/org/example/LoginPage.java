package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static jdk.jfr.internal.handlers.EventHandler.timestamp;

public class LoginPage extends Utils {


    // log in page fill in deatails

   // private By_Password =By.className("Password");
    private By _login = By.xpath("//button[text()=\"Log in\"]");

    public void VeryfyUserShouldClick() {

      //  typeText(_email, "testpatel" + timeStamp() + "@gmail.com");


       // typeText(_password, "Test1234");
        clickOnElement(_login);
    }

    public String expectedRegistretionCompleteMSG2 = "Your registration completed";

    public void VeryfyingUserShouldloginsuccessFully() {
        String actualMessage = getTextFromElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
        System.out.println("Actual masage:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedRegistretionCompleteMSG2, "User should vote now");


    }
}