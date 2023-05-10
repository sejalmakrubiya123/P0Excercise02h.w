package org.example;

import org.openqa.selenium.By;


public class RegisterPage extends Utils {



     By _firstname = By.id("FirstName");
     By _lastname = By.id("LastName");
     By _email = By.name("Email");
     By _password = By.id("Password");
      By _confirmPassword = By.id("ConfirmPassword");
     By _registerButton = By.id("register-button");
     By _loginButton = By.xpath("//button[text() ='Log in']");
     By _dayofBirthday = By.name("DateOfBirthDay");
     By _monthOfBirthday = By.name("DateOfBirthMonth");
     By _yearOfBirthday = By.name("DateOfBirthYear");
  //  private By _searchButton =By.className("class=button-1 search-box-button");
    public void enterRegistrationDetails(){

        //enter first name
        typeText(_firstname, "testFirstName");

        //enter last name
        typeText(_lastname, "testLatName");

        //enter date of birth
       selectElementByIndex(_dayofBirthday,23);

       //enter month of birth

       selectElementByText(_monthOfBirthday,"June");

       selectElementByValue(_yearOfBirthday,"1983");

        //enter email id
        typeText(_email, "testpatel" + timeStamp() + "@gmail.com");


        //enter password
        typeText(_password, "Test1234");

        //enter and confirm password
        typeText(_confirmPassword, "Test1234");

        //click on register button
        clickOnElement(_registerButton);
    }



}


