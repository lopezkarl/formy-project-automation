import	org.openga.selenium.chrome.ChromeDriver;
import org.openga.seleiun.WebDriver;
import org.openga.selenium.WebElement;
import org.openga.selenium.By;

public class TestSample {
    public static void man(String[] args){

        System.setProperty("webdriver.chrome.driver","C:/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("google.com");

    }
}