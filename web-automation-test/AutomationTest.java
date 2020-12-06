import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchbarAutomationTest {

    static WebDriver driver;

    String firstUrl = "https://www.rebel.pl/";
    String searchedTextBar = "/html/body/header/div[2]/div/nav/form/div[1]/input";
    String firstUrlExpected = "https://www.rebel.pl/site/search?phrase=Nemesis";
    String secondUrlExpected = "https://www.rebel.pl/site/search?phrase=robinson+crusoe";
    String accecibilityBar = "/html/body/main/div[1]/div[1]/div[1]/form/div/div[3]/button";


    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Adam/Documents/SELENIUM/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void searchbarTest() {
        driver.navigate().to(firstUrl);
        driver.findElement(By.xpath(searchedTextBar)).sendKeys("Nemesis");
        driver.findElement(By.xpath(searchedTextBar)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(accecibilityBar)).click();
        Assertions.assertNotEquals(searchedTextBar,firstUrlExpected);

        driver.navigate().to(firstUrl);
        driver.findElement(By.xpath(searchedTextBar)).sendKeys("Robinson Crusoe");
        driver.findElement(By.xpath(searchedTextBar)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(accecibilityBar)).click();
        Assertions.assertNotEquals(searchedTextBar,secondUrlExpected);

        
    }
    

}
