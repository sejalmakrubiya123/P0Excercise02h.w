package org.example;

import org.testng.annotations.Test;

public class TestSuite extends  BaseTest {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    ComparePage comparePage = new ComparePage();
    ComputerPage computerPage = new ComputerPage();
    EmailFriendPage emailFriendPage = new EmailFriendPage();
    AddToCartPage addToCartPage = new AddToCartPage();
    LoginPage loginPage = new LoginPage();
    SoftwarePage softwarePage = new SoftwarePage();
    Windows8page windows8page =new Windows8page();
    EmailWindowsPro8 emailWindowsPro8 = new EmailWindowsPro8();
    VoteResult voteResult = new VoteResult();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();

        //enter ragisteration deatails to fill form
        registerPage.enterRegistrationDetails();

        //verify user registered successfully or not
        registerResultPage.verifyUserRegisteredSuccessfully();
    }

    @Test
    public void veryfyUsershouldAbleToCompairIteam() {
        homePage.CompairTheElement();
        comparePage.clickelementList();
        comparePage.veryfytoMSGShouldappear();
    }

    @Test
    public void veryfiyUserShouldableToemailFriend() {
        homePage.emailfriendIteam();
        computerPage.ClickOnEmailToFriend();
        emailFriendPage.clickemaildetails();
        emailFriendPage.SuccessfullyemailtoFriend();
    }

    @Test
    public void verfiyUserShouldAbleToaddIteamoncart() {
        homePage.addTocardIteam();
        addToCartPage.UsershouldableToaddtheiteam();
        shoppingCartPage.successfulyiteamadd();
    }

    @Test
    public void verifiyregisterUserShouldableToreferIteam() {
        homePage.clickOnRegisterButton();
        registerPage.enterRegistrationDetails();
        registerResultPage.verifyUserRegisteredSuccessfully();

        homePage.clickOnLoginButton();
        softwarePage.clickOnelements();
        emailWindowsPro8.referItemToFriend();
        emailWindowsPro8.verfyUserreferiteamSuccessfully();
    }

    @Test
    public void veryfyRegisterUserShoulAbleToVotesuccessfullly() {
        homePage.clickOnRegisterButton();
        registerPage.enterRegistrationDetails();
        registerResultPage.verifyUserRegisteredSuccessfully();
        homePage.clickOnLoginButton();


        voteResult.VeryfyingUserShouldVote();

    }
}