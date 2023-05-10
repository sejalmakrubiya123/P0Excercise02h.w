package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class FacebookPage extends Utils{

     By _allowcookies = By.xpath("(//div[contains(@aria-label,'Allow all cookies')])[2]");
     By _close = By.xpath("//div[@aria-label='Close']");
     By _facebookLoginElements = By.cssSelector("form#login_form");
     By _fbEmail_Phone = By.xpath("//input[@placeholder='Email or phone']");
     By _fbPassword = By.xpath("//input[@placeholder='password']");
     By _fbLoginButton = By.xpath("//button[@id='loginbutton]");

    public void facebookActions() {
        // Store the window handle of the main window
        String mainWindowHandle = driver.getWindowHandle();

        // Switch to the child window
        for (String childWindowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(childWindowHandle);
        }
        String facebookPageURL = driver.getCurrentUrl();
        System.out.println("ChildWindow URL: " + facebookPageURL);
        Assert.assertEquals(facebookPageURL, "https://www.facebook.com/nopCommerce");

        //click on allow cookies
        clickOnElement(_allowcookies);

        clickOnElement(_close);

        if (driver.findElement(_fbEmail_Phone).isDisplayed()) {
            System.out.println("Element Email is Visible");
        } else {
            System.out.println("Element Email is InVisible");
        }

        if (driver.findElement(_fbPassword).isDisplayed()) {
            System.out.println("Element Password is Visible");
        } else {
            System.out.println("Element Password is InVisible");
        }

        if (driver.findElement(_fbLoginButton).isDisplayed()) {
            System.out.println("Element Log in is Visible");
        } else {
            System.out.println("Element Log in is InVisible");
        }
        //switch back to main window
        driver.switchTo().window(mainWindowHandle);
    }


}
