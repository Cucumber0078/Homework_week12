package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setUp(){

        openBroswer(baseUrl);
    }


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));

        // This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // Find the welcome text element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page",expectedMessage, actualMessage);

    }
    @Test
    public void userShouldNavigateToLoginSuccessfully(){
        // Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));
        // Find the email field element and Type email to email field
        sendTextElement(By.id("Email"),"aarav1123@yahoo.com");

        // Find the password field element
        sendTextElement(By.name("Password"),"abc555");

        // Find the login button and click on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectedMessage = "Log out";

        String actualMessage = getTextFromElement(By.xpath("//a[@class='ico-logout']"));
    }

    @Test
    public void verifyErrorMessage(){
        clickOnElement(By.linkText("Log in"));
        sendTextElement(By.id("Email"),"aarav1@yahoo.com");

        // Find the password field element
        sendTextElement(By.name("Password"),"abc555");

        // Find the login button and click on it
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        String actualMessage = getTextFromElement(By.xpath("//div[contains(@class,'message-error')]"));

    }

    }


