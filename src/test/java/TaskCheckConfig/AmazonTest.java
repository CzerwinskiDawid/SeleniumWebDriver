package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
        firstName.sendKeys("Adam");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Kowalski");

        List<WebElement> genders = driver.findElements(By.cssSelector("label.radio-inline"));
        WebElement gender = genders.get(0);
        gender.click();

        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        dateOfBirth.sendKeys("05/22/2010");

        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("Słoneczna 42");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("adwfawdwda231@example.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("412fvddfs@412@");

        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Coders Lab");

        WebElement comment = driver.findElement(By.id("comment"));
        comment.sendKeys("To mój pierwszy formularz automatyczny");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        driver.quit();

        System.out.println("Wszystko gra");

    }
}
