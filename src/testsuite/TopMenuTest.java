package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest
{

    @Before
    public void setUp(){
        openBrowser();
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully()
    {
        //click on the 'Computers' tab
        WebElement linkText = driver.findElement(By.linkText("Computers"));
        linkText.click();

        //Verify the text 'Computers'
        String expectedText = "Computers";
        String actualText = driver.findElement(By.linkText("Computers")).getText();
        Assert.assertEquals("the computer text not found", expectedText, actualText);

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        // click on the 'Electronics'
        WebElement linkText = driver.findElement(By.linkText("Electronics"));
        linkText.click();

        //click on the text 'Electronics'
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.linkText("Electronics")).getText();
        Assert.assertEquals("the Electronics text not found", expectedText, actualText);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully()
    {
         // click on the 'Apparel' tab
        WebElement linkText = driver.findElement(By.linkText("Apparel"));
        linkText.click();


        //verify the 'Apparel'
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.linkText("Apparel")).getText();
        Assert.assertEquals(" the Apparel text not found", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully()
    {
        // click on the 'Digital downloads' tab
        WebElement linkText = driver.findElement(By.linkText("Digital downloads"));
        linkText.click();

        //click on the text 'Digital downloads'
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.linkText("Digital downloads")).getText();
        Assert.assertEquals("the Digital downloads text not found", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully()
    {
        // click on the ‘Books’
        WebElement linkText = driver.findElement(By.linkText("Books"));
        linkText.click();

        //click on the text 'Books'
        String expectedText = "Books";
        String actualText = driver.findElement(By.linkText("Books")).getText();
        Assert.assertEquals("the Books text not found", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        // click on the ‘Jewelry’
        WebElement linkText = driver.findElement(By.linkText("Jewelry"));
        linkText.click();

        //click on the text 'Jewelry'
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.linkText("Jewelry")).getText();
        Assert.assertEquals("the Jewelry text not found", expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
        // click on the ‘Gift Cards’
        WebElement linkText = driver.findElement(By.linkText("Gift Cards"));
        linkText.click();

        //click on the text 'Gift Cards'
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.linkText("Gift Cards")).getText();
        Assert.assertEquals(" the Gift Cards text not found", expectedText, actualText);
    }
    @After
    public void close() {
        closeBrowser();
    }
}
