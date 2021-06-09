import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Radiobutton {
    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver","C:/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(1000);
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        Thread.sleep(1000);
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
        //driver.quit();
    }
}
