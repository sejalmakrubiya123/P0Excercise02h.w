package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static jdk.jfr.internal.handlers.EventHandler.timestamp;

public class EmailWindowsPro8 extends Utils{

    private By _friendEmail =By.xpath("//div[@class=\"form-fields\"]/div[1]/input");
    //friend
    private By _yourEmail = By.xpath("//div[@class=\"form-fields\"]/div[2]/input");
    private By _Text = By.xpath("//div[@class=\"form-fields\"]/div[3]/textarea");
    private By _Sendemail = By.xpath("//div[@class=\"buttons\"]");
    public void referItemToFriend(){
        typeText(_friendEmail,"sea"+timestamp()+"@gmail.com");
        typeText(_yourEmail, "tea"+timestamp()+"@gmail.com");
        typeText(_Text,"Hello");
        clickOnElement(_Sendemail);//click on send email button
    }
    String expectedRegistrationCompleteMGS = "Your registration completed";
    public void verfyUserreferiteamSuccessfully(){//method declair in the test siut class
        String actualMessage = getTextFromElement(By.xpath("//li[text()=\"Only registered customers can use email a friend feature\"]"));
        System.out.println("My mesage:"+actualMessage);// result willl come out
        Assert.assertEquals(actualMessage,expectedRegistrationCompleteMGS,"refereIteam"+"successfully");
    }
}
