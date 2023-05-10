package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCartPage extends Utils {

   String expectedProductInShoppingCartMessage = "product name is not matched";
    By _productname1 = By.className("product-name");


     By _computerDetailsInShoppingCart = By.xpath("//td[@class='product']/div[1]");
     By _checkoutButton = By.cssSelector("button#checkout");
     By _termsServiceCheckbox = By.cssSelector("input#termsofservice");
     By _buildYourOwnComputername = By.cssSelector("a.product-name");
   public void compareProductNameInAddToCart(){

       //verify &print out leica camera text
       String productname1 = getTextFromElement(_productname1);

       System.out.println("Product in add to cart: "+ productname1);

       //confirm product name is same in shopping cart as what we add
       Assert.assertEquals(productname1,expectedProductInShoppingCartMessage,"Product name is not matched");

   }

    public void verifyDetailsOfBuildYourOwnComputer(){
        String productname = getTextFromElement(_buildYourOwnComputername);
        System.out.println("Product Name: " + productname);

        //verify and assert computer details in shopping cart
        String actualComputerDetails = getTextFromElement(_computerDetailsInShoppingCart);
        System.out.println("ComputerDetails: " +actualComputerDetails);

        Assert.assertNotEquals(actualComputerDetails,"Details  is not matched");

        //click on terms of service
        clickOnElement(_termsServiceCheckbox);

        //click on checkout button
        clickOnElement(_checkoutButton);
    }

}