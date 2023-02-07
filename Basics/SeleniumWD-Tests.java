import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//input[@name='btnK']")).click();
        String title = driver.getTitle();
        assert title.contains("Selenium WebDriver");
    }

    @Test
    public void testClickLink() {
        driver.get("https://www.google.com");
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

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
