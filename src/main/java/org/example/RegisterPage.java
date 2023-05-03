package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils {

    private By _firstName = By.id("FirstName");
    private By _LastName = By.id("LastName");
    private By _Email =By.id("Email");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _registersubmitButton = By.id("register-button");
    private By _femaleButton = By.id("gender-female");
    // private By _firstName1 = By.id("FirstName");
    //  private By _LastName1 = By.className("LastName");
    //  private By _email1 = By.className("Email");
    //  private By _Password1 = By.id("Password");
    //  private By _ConfirmPassword1 = By.id("ConfirmPassword");
    //  private By _registersubmitButton1 = By.id("register-button");






    public void enterRegistrationDetails(){
        //click on register button
        clickOnElement(By.className("ico-register"));

        //enter first name

       // typeText(_FirstName,"testFirstName");

        //enter lastname
        typeText(_LastName, "testLastName");

        //enter email address
        typeText(_Email, "testpatel" + timeStamp() + "@gmail.com");

        //enter password
      //  typeText(_password, "test1234");

        //enter confirm password
        typeText(_ConfirmPassword, "test1234");

        //click on register submit button
        clickOnElement(By.id("register-button"));

        clickOnElement(_registersubmitButton);


    }
    public String expectedRegistretionCompleteMSG = "Your registration completed";
    public void VeryfyingUserShoulVote(){
        String actualMessage = getTextFromElement(By.xpath("//div[@id=\"poll-block-1\"]/div[2]"));
        System.out.println("Actual masage:"+actualMessage);
        Assert.assertEquals(actualMessage,expectedRegistretionCompleteMSG,"User should vote");

    }







    }


