package org.example;

import org.testng.annotations.Test;

public class TestSuite extends  BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();


    ElectronicsPage electronicsPage = new ElectronicsPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    EmailFriendPage emailFriendPage = new EmailFriendPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    LeicaTMirrorlessDigitalCameraPage leicaTMirrorlessDigitalCameraPage = new LeicaTMirrorlessDigitalCameraPage();
    AddToCartPage addToCartPage = new AddToCartPage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();
    ProductPage productpage = new ProductPage();
    FacebookPage facebookPage = new FacebookPage();
    CheckOutBillingPage checkoutBillingPage = new CheckOutBillingPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    CheckOutAsGuestPage checkOutAsGuestPage = new CheckOutAsGuestPage();
    NopComNewReleasePage nopComNewReleasePage = new NopComNewReleasePage();

    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {

        //click on register button
        homePage.clickOnRegisterButton();


//        //enter registeration deatails to fill form
        registerPage.enterRegistrationDetails();
//
//        //verify user registered successfully or not
        registerResultPage.verifyUserRegisteredSuccessfully();


    }

    @Test

    public void verifyUserShouldBeAbleToReferAproductToFriendSuccessfully() {

        //click on register button
        homePage.clickOnRegisterButton();

        //enter register details
        registerPage.enterRegistrationDetails();

        //click on login
        homePage.clickOnLogin();

        //enter  login details
        loginPage.enterLoginDetails();

        //click on build your own computer
        homePage.clickOnBuildYourOwnComputer();

        //click on email a friend
        buildYourOwnComputerPage.emailAfriend();

        //type friends email , and click on send email button
        emailFriendPage.enterEmailAFriendDetailsRegisteredUser();

    }

    @Test
    public void VerifyRegisteredUserShouldBeAbleToVoteSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();

        //enter register details
        registerPage.enterRegistrationDetails();

        //click on login
        homePage.clickOnLogin();

        //enter login detais
        loginPage.enterLoginDetails();

        //click on good radio button
        homePage.clickOnGoodRadioButton();

        //click on vote button
        homePage.clickOnVoteButton();

        // verify message
        homePage.verifyRegisteredUserShouldBeAbleToVoteSuccessfully();


    }

    @Test
    public void verifySearchAlertMessage() {
        homePage.searchAleartMessage();
    }

    @Test
    public void VerifyUserShouldBeAbleToCompare2Products() {
        //click on hts mobile compare button
        homePage.clickOnHTCAndroidCompareButton();

        //click on green notification bar
        homePage.clickToCloseGreenBar();

        //click on 25$virtual gift card compare button
        homePage.clickOn25$VirtualGiftCardCompareButton();

        //click on green notification bar
        homePage.clickToCloseGreenBar();

        //click on comparision products text on green notification bar
        homePage.clickOnProductComparisionText();

        //steps on compare products page
        compareProductsPage.productComparisionPage();


    }

    @Test
    public void verifyNonRegisteredUserShouldNotBeAbleToEmailFriend() {

        //click on add to cart button of build your own computer
        homePage.clickOnAddToCartBuildYourOwnComputer();

        //click on email a friend button
        buildYourOwnComputerPage.emailAfriend();

        //fill in details on email a friend as non registered user
        emailFriendPage.fillInEmailAFriendDetailsNonRegisteredUser();

    }

    @Test
    public void verifyNonRegisteredUserShouldNotBeAbleToVote() {

        //click on good radio button
        homePage.clickOnGoodRadioButton();

        //click on vote
        homePage.clickOnVoteButton();

        //verify and print error message
        homePage.verifyNonRegisteredUserShouldNotBeAbleToVoteSuccessfully();

    }

    @Test
    public void verifyUserShouldBeAbleToSeeProductsInShoppingAddToCartSuccessfully() {

        //click on Electronics
        homePage.clickOnElectronics();

        //click on camera & photo image
        electronicsPage.clickOnCameraAndPhoto();

        //click on Leica camera
        cameraAndPhotoPage.clickOnLeicaCamera();

        //get leica camera text
        leicaTMirrorlessDigitalCameraPage.leicaCameraAddToCartAndShoppingCart();

        // to compare product name matched or not in shopping cart
        addToCartPage.compareProductNameInAddToCart();


    }

    @Test
    public void verifyUserShouldBeAbleToPrintProductTitlesSuccessfully() {
        homePage.printoutProductTitles();
    }

        @Test
        public void verifyUserShouldBeAbleToSelectAndPrintCurrencyAccordingly() {
            homePage.cilckCurrencyUsDollar();

            homePage.clickCurrencyEuro();
        }
        @Test
        public void verifySearchFunctionalityIsWorkingFine ()
        {
            homePage.searchFunctionality();

            productpage.printProductName();

        }
        @Test
        public void verifyLatestNopCommerceNewReleaseCommentShouldAppearLastInSequence () {

            homePage.clickOnNopComNewRelease();

            nopComNewReleasePage.fillInNewReleaseDetails();

        }
        @Test
        public void verifyGuestUserShouldBeAbleToCheckoutSuccessfully ()
    {
            homePage.clickOnAddToCartBuildYourOwnComputer();

            productpage.buildYourOwnComputer();

            addToCartPage.verifyDetailsOfBuildYourOwnComputer();

            checkOutAsGuestPage.verifyCheckoutAsAGuest();

            checkoutBillingPage.enterIngCheckoutBillingDetails();

            shippingMethodPage.clickOnShippingMethod();

            shippingMethodPage.paymentMethod();

            shippingMethodPage.confirmOrder();


        }
        @Test
        public void verifyUserShouldBeAbleToSwitchToFacebookWindowTab () {
            homePage.verifyOpenAndCloseFacebookTabs();

            facebookPage.facebookActions();

            homePage.verifyWelcomeMessage();


        }
        @Test
        public void verifyAlertMessageWhenUserClickOnVoteWithoutSelectingAnyOption () {
            homePage.verifyVoteAlertMessage();

        }


    }
