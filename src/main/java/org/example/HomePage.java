package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils {
    //click for register button
    private By _registerButton = By.className("//a[text()=\"Register\"]");

    //click on good
    private By _GooD = By.xpath("//input[contains(@id,\"pollanswers-2\")]");
    //click on element
    private By _Vote = By.xpath("//div[@id=\"poll-block-1\"]/div[1]");
    // iteam apple mac book
    private By _compairButton = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[2]");
    // compair iteam Visual gift card
    private By _compairButtontwo = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    // message appear compair item to go next page click on
    private By _productCompair = By.xpath("//a[text()='product comparison']");
    // add product success fully build own computer
    private By _clickComputer = By.xpath("//a[text()='Build your own computer']");
    // addd to go camera product
    private By _Electrics = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]/a");
    //drop down button camera click on
    private By _Clickcamera = By.xpath("/div[@class=\"header-menu\"]/ul[1]/li[2]/ul/li[1]/a/");

    private By _Good1 = By.className("pollanswers-1");// register successfull
    private By _Vote1 = By.xpath("//button[text()=\"Vote\"]");//
    private By _login = By.xpath("//a[text()=\"Log in\"]");// do log in for vote
    private By _computers = By.linkText("Computers ");// click on computer button
    private By _Softwear = By.linkText("Software ");//click on softwear button


    public void clickOnRegisterButton() {


        //click on register button
        clickOnElement(_registerButton);

       // public void DoVoteButton () {
            clickOnElement(_GooD);
            clickOnElement(_Vote);
        }

       // public void CompairTheElement () {
            //clickOnElement(_compairButton);
           // clickOnElement(_compairButtontwo);
           // clickOnElement(_productCompair);
       // }

        //public void emailfriendIteam () {
           // clickOnElement(_clickComputer);
      //  }

       // public void addTocardIteam () {
           // clickOnElement(_Electrics);
           // clickOnElement(_Clickcamera);
     //   }

      //  public void clickOnLoginButton () {



        public void clickOncomputerandsoftwear () {
            clickOnElement(_computers);
            clickOnElement(_Softwear);

        }


       // public void CompairTheElement () {



       // public void emailfriendIteam () {







        public void clickOnLoginButton () {

        }
    }
