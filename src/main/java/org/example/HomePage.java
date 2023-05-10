package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {


     String expectedRegistereduserVoteMessage = "You can't vote";
     String expectedNonRegisteredUserVoteMsg ="Every user can vote";

     String expectedvotemessageWithoutSelection ="No Message";

     String expectedEuroMessage ="Euro";
     String expectedUsDollarMessage ="Us Dollar";
     String expectedWelcomeMessage = "No message";

     By _registerButton = By.className("ico-register");
      By _goodRadioButton = By.id("pollanswers-2");
     By _voteButton = By.xpath("//button[text()='Vote']");

     By _verifyErrorVoteMessage = By.className("poll-vote-error");
      By _login = By.xpath("//a[contains(@class,ico-login)]");
      By _buildYourOwnComputer = By.xpath("//a[@href=/build-your-own-computer][text()='Build your own computer']");
     By _verifyVoteMessageForRegUser = By.xpath("//span[@class=poll-total-votes]");
     By _clickOnAddToCartBuildYourOwnComputer = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]");
     By _clickOnElectronics = By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[2]/a[@href='/electronics']");
     By _HTCAndroidCompareButton = By.xpath("//div[@class='item-grid']/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
     By _virtual25$GiftCardCompareButton = By.xpath("//div[@class='item-grid']/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
      By _greenBarClose = By.xpath("//span[@class= close]");
     By _productComparisionText = By.xpath("//a[text()='product comparison']");

     By _clearList = By.className("clear-list");
     By _searchButton =By.xpath("//button[contains(@type,'submit')]");
     By _currencySelector = By.xpath("//select[@id='customerCurrency']");


     By _searchholderText =By.cssSelector("input.search-box-text");
     By _usDollar = By.xpath("//option[text()='US Dollar']");
     By _euro = By.xpath("//option[text()='Euro']");
     By _facebookLogo = By.cssSelector("li.facebook");
     By _welcomeMessage = By.xpath("//h2[text()='Welcome to our store']");
     By _nopComDetailsButton= By.xpath("//a[@href='/nopcommerce-new-release'][text()='details']");
     By _productPricesFeaturedProducts = By.cssSelector("div.prices");




    public void printoutProductTitles() {
        //storing web elements inside List
        List<WebElement> productList = driver.findElements(By.cssSelector("div.product-grid h2"));

        //each loop method to print product names on product grid
        for (WebElement e : productList) {
            System.out.println(e.getText());
        }

    }

public void searchAleartMessage(){
    //click on search button
         clickOnElement(_searchButton);

         //verify message without locator , you can not right click and inspect alert message

    Alert alert = driver.switchTo().alert();

    //to check actual and expected is same
    Assert.assertEquals(alert.getText(),"please enter some search keyword---------------");
    alert.accept();
}
    public void clickOnRegisterButton() {


        //click on register button
        clickOnElement(_registerButton);


    }
    public void clickOnGoodRadioButton(){
        //click on good radio button
        clickOnElement(_goodRadioButton);
    }
    public void clickOnVoteButton(){
        //click on vote button
        clickOnElement(_voteButton);
    }
    public void verifyNonRegisteredUserShouldNotBeAbleToVoteSuccessfully(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("poll-vote-error")));

        //to verify message pop uo when u click on vote button
        String actualmessage = getTextFromElement(_verifyErrorVoteMessage);

        //to print error messase
        System.out.println("my message: " +actualmessage);
        Assert.assertEquals(actualmessage,expectedNonRegisteredUserVoteMsg,"Non registered customer can vote");
    }
    public void clickOnLogin(){
        //click on login
        clickOnElement(_login);

    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(_buildYourOwnComputer);
    }
    public void verifyRegisteredUserShouldBeAbleToVoteSuccessfully(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class=\"poll-results\"]/li[1]")));

        String actualmessage = getTextFromElement(_verifyVoteMessageForRegUser);

        System.out.println("message: " + actualmessage);
        Assert.assertEquals(actualmessage, expectedRegistereduserVoteMessage, "You can't vote");

    }
    public void clickOnAddToCartBuildYourOwnComputer(){

        //click on add to cart button on build your own computer
        clickOnElement(_clickOnAddToCartBuildYourOwnComputer);

    }
    public void clickOnElectronics(){
        clickOnElement(_clickOnElectronics);
    }
    public void clickOnHTCAndroidCompareButton(){
        clickOnElement(_HTCAndroidCompareButton);
    }
    public void clickOn25$VirtualGiftCardCompareButton(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickOnElement(_virtual25$GiftCardCompareButton);

    }
    public void clickToCloseGreenBar(){
        clickOnElement(_greenBarClose);


    }
    public void clickOnProductComparisionText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_productComparisionText));
        clickOnElement(_productComparisionText);

    }

    public void  cilckCurrencyUsDollar(){
    //select euro in currency selector
        String actualCurrency = getTextFromElement(_usDollar);

        System.out.println("Selected Currency:" +actualCurrency);

        //select euro in currency selector

        selectElementByText(_currencySelector, "Us Dollar");

          //creat list of elements
        List<WebElement> actualcurrency = driver.findElements(By.xpath("//select[@id='customerCurrency']"));

        for (WebElement e : actualcurrency){

            //print out product price with dollar sign
            System.out.println(e.getText());



        }
        //Assert Message
        Assert.assertEquals(actualCurrency, expectedUsDollarMessage, "Us Dollar");

    }
    public void clickCurrencyEuro(){
           String actualCurrency = getTextFromElement(_euro);

        System.out.println("Selected Currency :" +actualCurrency);

        //select euro in currency selector
        selectElementByText(_currencySelector , "Euro");

        // creat list for elements
        List<WebElement> actualcurrency = driver.findElements(By.xpath("//select[@id='customerCurrency']"));

        for (WebElement e : actualcurrency){
            //print product price with euro sign
            System.out.println(e.getText());




        }
            Assert.assertEquals(actualCurrency,expectedEuroMessage,"Euro");
    }
    public void verifyVoteAlertMessage() {
        clickOnElement(_voteButton);

        //verify message without locator , u cant right click and inspect alert message
        Alert alert = driver.switchTo().alert();

        //to check actual and expected is same
        Assert.assertEquals(alert.getText(), "Please select an answer");

        //click on ok with accept method as u cant click and get locator in alert message
        alert.accept();



    }

    public void searchFunctionality() {
        typeText(_searchholderText, "sketcher");
        clickOnElement(_searchButton);

    }

    public void verifyOpenAndCloseFacebookTabs() {
        //click on fb symbol
        clickOnElement(_facebookLogo);


    }

    public void verifyWelcomeMessage(){

        String currentURL = driver.getCurrentUrl();
        System.out.println("Homepage URL: " + currentURL);
        String actualmessage = getTextFromElement(_welcomeMessage);

        //to print message
        System.out.println("message: " +actualmessage);

        //to verify actual and expected result matched or not
        Assert.assertEquals(actualmessage, expectedWelcomeMessage,"No Message");
    }
    public void clickOnNopComNewRelease(){
        //click on details button of nopcom new release
        clickOnElement(_nopComDetailsButton);
    }




}

