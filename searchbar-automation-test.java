import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationTest {

    static WebDriver driver;

    String urlRebel = "https://www.rebel.pl/";
    String searchedText = "/html/body/header/div[2]/div/nav/form/div[1]/input";
    String urlExpected = "https://www.rebel.pl/site/search?phrase=Nemesis";


    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Adam/Documents/SELENIUM/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void iloscLinkowNaStronie() {
        driver.navigate().to(urlRebel);
        driver.findElement(By.xpath(searchedText)).sendKeys("Nemesis");
        driver.findElement(By.xpath(searchedText)).sendKeys(Keys.ENTER);
        Assertions.assertNotEquals(searchedText,urlExpected);

    }
}
