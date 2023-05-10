package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NopComNewReleasePage extends Utils{

     By _title = By.cssSelector("input.enter-comment-title");
     By _comment = By.cssSelector("textarea.enter-comment-text");
     By _newCommentButton = By.xpath("//button[text()='New comment']");
     By _newsCommentMessage = By.xpath("//div[text()='News comment is successfully added.']");
     By _commentSequence = By.cssSelector("div.comment-list");
    public void fillInNewReleaseDetails(){
        //verify user is on nopcom new release page
        String currentURL = driver.getCurrentUrl();
        System.out.println("URL: " + currentURL);
        Assert.assertEquals(currentURL, "https://demo.nopcommerce.com/nopcommerce-new-release");

        //type title
        typeText(_title,"Good Morning");

        //type comment
        typeText(_comment,"Check this Website");

        //click on new comment button
        clickOnElement(_newCommentButton);

        //verify news comment message

        String actualmessage = getTextFromElement(_newsCommentMessage);

        //to print message
        System.out.println("message: " +actualmessage);

        //to verify actual and expected result matched or not
        Assert.assertEquals(actualmessage,"News comment is successfully added.");

        //to scroll down
        scrollViewElement(_commentSequence);


    }

}
