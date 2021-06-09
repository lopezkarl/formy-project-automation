import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FormPage {
    public static void submitForm(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,30);
        driver.findElement(By.id("first-name")).sendKeys("Karl");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("last-name")).sendKeys("Lopez");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        WebElement Date = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
        Date.sendKeys("12/12/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
