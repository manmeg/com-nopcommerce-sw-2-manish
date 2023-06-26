package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {


    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on the ‘Login’ link
        WebElement linkText = driver.findElement(By.xpath("//a[text()='Log in']"));
        linkText.click();

        //Verify the text ‘Welcome, Please Sign In!’
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
        Assert.assertEquals("Not redirected to Login page", expectedText, actualText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on the ‘Login’ link
        WebElement linkText = driver.findElement(By.xpath("//a[text()='Log in']"));
        linkText.click();

        //Enter email
        driver.findElement(By.id("Email")).sendKeys("mani123@gmail.com");
        //Enter password
        driver.findElement(By.name("Password")).sendKeys("mani777");

        //Click on Login Button
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();

        //Verify the text ‘Log out’
        driver.findElement(By.xpath("//a[text()='Log out']")).getText();
        String expectedText = "Log out";
        String actualText= driver.findElement(By.xpath("//a[text()= 'Log out']")).getText();
        Assert.assertEquals(" the Log out text not found ",expectedText,actualText);




    }

        @Test
        public void verifyTheErrorMessage() {
            //click on the ‘Login’ link
            WebElement linkText = driver.findElement(By.xpath("//a[text()='Log in']"));
            linkText.click();

            // find email and type
            driver.findElement(By.id("Email")).sendKeys("mani123@gmail.com");
            //
            driver.findElement(By.name("Password")).sendKeys("mani777");

            //Click on Login Button
            driver.findElement(By.xpath("//button[text() ='Log in']")).click();

            String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                    "No customer account found";
            String actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
            Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);

        }




    @After
    public void closeDown() {
        closeBrowser();
    }
}

