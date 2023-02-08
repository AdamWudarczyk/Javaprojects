import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WebDriverTest {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }
    @Test
    public void testSearch() {
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.className("gLFyf")).click();
        driver.findElement(By.className("gLFyf")).sendKeys("Selenium WebDriver");
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.RETURN);
        String searchtitle = driver.getTitle();
        assert searchtitle.contains("Selenium WebDriver");
    }

    @Test
    public void testClickLink() {
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.xpath("//a[text()='Gmail']")).click();
        String title = driver.getTitle();
        assert title.contains("Gmail");
    }

    @Test
    public void testEnterText() {
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium WebDriver");
        String enteredText = driver.findElement(By.xpath("//input[@name='q']")).getAttribute("value");
        assert enteredText.equals("Selenium WebDriver");
    }

    @Test
    public void testPageSource() {
        driver.get("https://www.google.com");
        String pageSource = driver.getPageSource();
        assert pageSource.contains("Google");
    }

    @Test
    public void testBackButton() {
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.xpath("//a[text()='Gmail']")).click();
        String title1 = driver.getTitle();
        driver.navigate().back();
        String title2 = driver.getTitle();
        assert !title1.equals(title2);
         }

    @AfterTest
    public void teardown() {
       driver.quit();
   }
}
