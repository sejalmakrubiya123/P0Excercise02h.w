package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComparePage extends Utils {


    //click on clear button
    private By _clearList = By.xpath("//a[text()='Clear list']");

    public void clickelementList() {
        clickOnElement(_clearList);
    }

     public String expectedCompare2ProductsMsg = "Your registration completed";

    public void veryfytoMSGShouldappear() {
        //message will apear no iteam to compair
        String actualMessage = getTextFromElement(By.xpath("//div[text()='You have no items to compare.']"));
        System.out.println("Actual masage:" + actualMessage);
        Assert.assertEquals(actualMessage,expectedCompare2ProductsMsg, "User should compare");
    }
}