package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBroswer(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        clickOnElement(By.linkText("Register"));
        //verify the Register
        String expectedText = "Register";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Register']"));
        Assert.assertEquals("Text not verify", expectedText, actualText);

    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //
        clickOnElement(By.linkText("Register"));

        //enter the user information
        clickOnElement(By.xpath("//input[@type='radio' and @value='M']\n"));
        sendTextElement(By.xpath("//input[@id='FirstName']\n"), "Aaarav");
        sendTextElement(By.xpath("//input[@id='LastName']\n"), "pansuriya");
        clickOnElement(By.xpath("//select[@name='DateOfBirthDay']/option[@value='10']\n"));
        clickOnElement(By.xpath("//select[@name='DateOfBirthMonth']/option[@value='10']"));
        clickOnElement(By.xpath("//select[@name='DateOfBirthYear']/option[@value='2010']\n"));
        sendTextElement(By.xpath("//input[@id='Email']\n"), "aarav1123@yahoo.com");
        sendTextElement(By.xpath("//input[@id='Password']\n"), "abc555");
        sendTextElement(By.xpath("//input[@id='ConfirmPassword']\n"), "abc555");
        clickOnElement(By.xpath("//button[@id='register-button']"));

        String expectedMassage = "Register";

        //Verify Register
        String actualMassage = getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));
        Assert.assertEquals("Your Registration is Complited",expectedMassage,actualMassage);
    }

    @After
    public void closeBrowser() {
        driver.quit();

    }
}
