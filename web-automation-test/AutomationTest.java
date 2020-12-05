import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationTest {

    static WebDriver driver;

    String firstUrl = "https://www.rebel.pl/";
    String searchedTextBar = "/html/body/header/div[2]/div/nav/form/div[1]/input";
    String urlExpected = "https://www.rebel.pl/site/search?phrase=Nemesis";
    String accecibilityBar = "/html/body/main/div[1]/div[1]/div[1]/form/div/div[3]/button";
    String subSearchBarMenu = "ui-id-1";
    String subSearchBarMenuList = "search-item search-item--product ui-menu-item-wrapper";

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
        Assertions.assertNotEquals(searchedTextBar,urlExpected);


    }

    @Test
    public void subsearchbarTest(){
        driver.navigate().to(firstUrl);
        driver.findElement(By.xpath(searchedTextBar)).sendKeys("Nemesis");
        driver.findElement(By.id(subSearchBarMenu));
        Assertions.assertEquals(subSearchBarMenuList, subSearchBarMenuList);
    }


}
