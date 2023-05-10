package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.sql.Timestamp;
import java.time.Duration;

public class Utils extends BasePage{


    //-----------------------------Select class method------------------------------------------------//

    //this method willselect the option by visible text
    public void selectByVisibleTextFromDropDown(By by,String text){
        WebElement dropDown  = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);

    }

    //This method will selaect the option by contains text
   // public void selectByContainsTextFromDropDown (By by , String text){
         // list<webElement> alloptions =new Select(driver.findElement(by)).getOptions();
         // for (WebElement options : alloptions){
            //  if (options.getText().contains(text)){
                 // options.click();
              //}
          //}



//method for
    public static  void selectElementByText(By by , String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectElementByValue(By by , String value){
       Select select = new Select(driver.findElement(by)) ;
       select.selectByValue(value);
    }
    public static void selectElementByIndex(By by , int number){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(number);
    }

    //this method will click on element
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }


    //this method will send text on element
    public static void typeText(By by , String text)
    {
        driver.findElement(by).sendKeys(text);
    }


    //this method will get text from element
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }



    public static long timeStamp()
    {
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        return timestamp1.getTime();

    }
    // method will switch to alert
    public void switchToAlert(){
        driver.switchTo().alert();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    //this method will dismissAlert
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    //reusable method is explicit wait untill condition of visiblity element
    public static void explicitWait_VisibilityofElementLocated(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    // Reusable method is explicit wait to wait until condition Element
    public static void explicitWait_ElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // Reusable method is explicit wait to wait until condition of Invisibility of Element
    public static void explicitWait_InvisibilityOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    // Reusable method is explicit wait to wait until condition of Text to be present in element
    public static void explicitWait_TextToBePresentInElementLocated(By by, String text) {
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));

        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
    }
    public static void scrollViewElement(By by) {

        WebElement element = driver.findElement(by);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println(element.getText());
    }

    public static void explicitWait_UrlMatches(String url){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlMatches(url));
    }

}






