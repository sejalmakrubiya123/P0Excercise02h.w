package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utils{
       By _emailAfriendButton = By.xpath("//button[text()='Email a friend']");
      public void emailAfriend(){

          //click on email a friend
          clickOnElement(_emailAfriendButton);
      }
    }

