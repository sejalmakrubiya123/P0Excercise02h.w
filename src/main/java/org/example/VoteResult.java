package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class VoteResult extends Utils {

    public String expectedRegistretionCompleteMSG = "Your registration completed";

    public void VeryfyingUserShouldVote() {//for vote mesage success full
        String actualMessage = getTextFromElement(By.xpath("//div[@class=\\\"poll-vote-error\\\"]"));
        System.out.println("Actual masage:" + actualMessage);
        //expected result
        Assert.assertEquals(actualMessage, expectedRegistretionCompleteMSG, "User should vote");


    }
}