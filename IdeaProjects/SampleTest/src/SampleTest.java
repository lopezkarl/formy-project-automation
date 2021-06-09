import	org.openga.selenium.chrome.ChromeDriver;
import org.openga.seleiun.WebDriver;
import org.openga.selenium.WebElement;
import org.openga.selenium.By;
    public class SampleTest {
        public static void man(String[] args){

            System.setProperty("webdriver.chrome.driver","C:/bin/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://formy-project.herokuapp.com/keypress");
            WebElement name = driver.findElement(By.id("name"));
            name.sendKeys("Karl");
            WebElement button = driver.findElement(By.id("button"));
            button.click();

            driver.quit();

        }
    }

