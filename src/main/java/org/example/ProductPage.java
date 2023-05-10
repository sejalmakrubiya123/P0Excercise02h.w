package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utils{

     By _processor = By.id("product_attribute_input_1");
     By _ram = By.cssSelector("select input product_attribute_2");
     By _hdd = By.cssSelector("inputproduct_attribute_3_6");
     By _os = By.cssSelector("inputproduct_attribute_4_9");
     By _checkBox1 = By.cssSelector("input#product_attribute_5_10");

     By _addToCart = By.xpath("//button[@class='button-1 add-to-cart-button']");
     By _shoppingCart = By.cssSelector("span.cart-label");
    public void printProductName(){

        List<WebElement> searchText = driver.findElements(By.className("product-title"));

        for (WebElement e:searchText){
            System.out.println(e.getText());

        }

    }
    public void buildYourOwnComputer(){
        //select 2.2 GHz processor
        selectElementByIndex(_processor,1);

        //select 8GB RAM
        selectElementByValue(_ram,"5");

        //click on 320 GB HDD radio button
        clickOnElement(_hdd);

        //click on vista premium OS radio button
        clickOnElement(_os);

        //uncheck on checkbox 1
        clickOnElement(_checkBox1);

        //click on all checkboxes
        clickOnElement(_checkBox1);



        //click on add to cart
        clickOnElement(_addToCart);

        //click on shopping cart
        clickOnElement(_shoppingCart);

    }
}

