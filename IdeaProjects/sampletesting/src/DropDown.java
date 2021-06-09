import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDown {
    public static void main(String [] args){

        System.setProperty("webDriver.chrome.driver","C:/Users/Sqreem/Downloads/chromedriver_win32 (3)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDownMenus = driver.findElement(By.id("dropDownMenuButton"));
        dropDownMenus.click();
        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();


        driver.quit();
    }
}
