package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;



public class LoginPage extends Utils {

    private By _email = By.xpath("//input[contains(@class,\"email\")]");
    private By _password = By.xpath("//input[contains(@class,\"password\")]");
    private By _loginButton = By.xpath("//button[text() ='Log in']");
    public void enterLoginDetails(){

        //type email
        typeText(_email, "abc@gmail.com");

        //type password
        typeText(_password, "Test123");

        //click on login button
       clickOnElement(_loginButton);
    }

}