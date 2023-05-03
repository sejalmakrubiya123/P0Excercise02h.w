package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterResultPage extends  Utils {

    static String expectedRegistrationCompleteMsg = "Registration not working";


    public void verifyUserRegisteredSuccessfully() {

        //verify message
        String actualmessage = getTextFromElement(By.xpath("//div[@class='result']"));
        getTextFromElement((By.xpath("//div[@class='result']")));

        //to print message
        System.out.println("message: " + actualmessage);

        //to verify actual and expected result matched or not

        Assert.assertEquals(actualmessage, expectedRegistrationCompleteMsg, "Registration not working");


    }



    }
