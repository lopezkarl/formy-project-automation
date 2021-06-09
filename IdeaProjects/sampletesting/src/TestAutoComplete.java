import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestAutoComplete {
        public static void main(String [] args){

            System.setProperty("webDriver.chrome.driver","C:/bin/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://formy-project.herokuapp.com/autocomplete");
            WebElement autocomplete = driver.findElement(By.id("autocomplete"));
            autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
            WebDriverWait wait = new WebDriverWait(driver,10);
            WebElement auto = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item"))); //explicit wait
            //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); #implicitwait
            //Thread.sleep(1000);
            //WebElement auto = driver.findElement(By.className("pac-item"));
            auto.click();

            //driver.quit();
        }
    }
