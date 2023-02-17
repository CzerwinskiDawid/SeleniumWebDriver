package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DuckSearchTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Stanisław Napierała youtube");
        element.submit();
        WebElement element1 = driver.findElement(By.id("r1-0"));
        element1.click();
        Thread.sleep(4000);
        WebElement acceptButton = driver.findElement(By.xpath("//button[@aria-label='Zaakceptuj wykorzystywanie plików cookie i innych danych do opisanych celów']"));
        acceptButton.click();
        Thread.sleep(20000);
        WebElement noThanks = driver.findElement(By.xpath("//button[@aria-label='Nie, dziękuję']"));
        if (noThanks.isDisplayed()) {
            noThanks.click();
        } else {
            Thread.sleep(8000);
            noThanks.click();
        }



    }
}
