package org.example;

import org.openqa.selenium.By;

public class Windows8page extends Utils {
    private By _ClickEmail = By.xpath("//button[text()=\"Email a friend\"]");

    public void clickonthebutton() {
        clickOnElement(_ClickEmail);


    }
}