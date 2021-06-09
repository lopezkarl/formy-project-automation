import	org.openga.selenium.chrome.ChromeDriver;
import org.openga.seleiun.WebDriver;
import org.openga.selenium.WebElement;
import org.openga.selenium.By;

public class KeyboardTest{
    public static void man(String[] args){

        System.setProperty("webdriver.chrome.driver","/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("google.com");

    }
}