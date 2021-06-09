import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class FormOOP {
    public static void main(String [] args) {

        System.setProperty("webDriver.chrome.driver","C:/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        FormPage formPage = new FormPage();
        FormPage.submitForm(driver);
        ConfirmationPage confirmationPage = new ConfirmationPage();
        ConfirmationPage.waitForAlertBanner(driver);
        assertEquals("The form was successfully submitted!",confirmationPage.getAlertBannerText(driver));
        driver.quit();  
    }




}
