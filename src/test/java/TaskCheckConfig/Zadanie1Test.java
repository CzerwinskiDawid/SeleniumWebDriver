package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Zadanie1Test {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement signIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("user-info")));
        signIn.click();
        WebElement registration = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-link-action=\"display-register-form\"]")));
        registration.click();
        driver.navigate().back();
        driver.navigate().back();

        driver.quit();
    }
}
