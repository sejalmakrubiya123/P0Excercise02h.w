package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{

        public String  expectedProductInShoppingCartMessage   = "Your addtocart completed";
        public void successfulyiteamadd(){
            String actualMessage = getTextFromElement(By.xpath("//button[text()=\"Update shopping cart\"]"));
            System.out.println("Actual masage:"+actualMessage);
            Assert.assertEquals(actualMessage, expectedProductInShoppingCartMessage,"User should add the item");
        }


}
