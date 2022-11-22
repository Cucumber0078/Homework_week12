package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBroswer(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        clickOnElement(By.linkText("Computers"));

        //verify the Computer
        String expectedText = "Computers";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Computers']"));
        Assert.assertEquals("Text not verify", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        clickOnElement(By.linkText("Electronics"));

        //verify the 'Electronics’
        String expectedText = "Electronics";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Electronics']"));
        Assert.assertEquals("Text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull() {
        clickOnElement(By.linkText("Apparel"));

        //verify the 'Apparel'
        String expectedText = "Apparel";
        String actualText = getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        Assert.assertEquals("Text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        clickOnElement(By.linkText("Digital downloads"));

        //verify the 'Digital downloads'
        String expectedText = "Digital downloads";
        String actualText = getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        Assert.assertEquals("Text not verify", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        clickOnElement(By.linkText("Books"));

        //verify the 'Books'
        String expectedText = "Books";
        String actualText = getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));
        Assert.assertEquals("Text not verify", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        clickOnElement(By.linkText("Jewelry"));

        //verify the 'Jewelry'
        String expectedText = "Jewelry";
        String actualText = getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        Assert.assertEquals("Text not verify", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull() {
        clickOnElement(By.linkText("Gift Cards"));

        //verify the ‘Gift Cards’
        String expectedText = "Gift Cards";
        String actualText = getTextFromElement(By.xpath("//h1[text()='Gift Cards']"));
        Assert.assertEquals("Text not verify", expectedText, actualText);

    }
    @After
    public void closeBrowser() {
        driver.quit();

    }
}
