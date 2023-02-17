package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class twitchSearchTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://www.twitch.tv/");
        WebElement element = driver.findElement(By.xpath("//input[@aria-label=\"Pole wyszukiwania\"]"));
        element.sendKeys("Overpow");
        WebElement searching = driver.findElement(By.xpath("//button[@aria-label=\"Przycisk wyszukiwania\"]"));
        searching.click();
        WebElement overpowCanal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/overpow\"]")));
        overpowCanal.click();
        WebElement cookieAccept = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-a-target=\"consent-banner-accept\"]")));
        cookieAccept.click();
        WebElement fullScreen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label=\"Pełny ekran (f)\"]")));
        fullScreen.click();


    }
}
