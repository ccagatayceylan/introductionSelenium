import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.cssSelector("#userName"));
        fullName.click();
        fullName.sendKeys("Çağlar Çağatay CEYLAN");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        eMail.click();
        eMail.sendKeys("cagatayceylan026@gmail.com");

        WebElement currentAdress = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]"));
        currentAdress.click();
        currentAdress.sendKeys("Büyükada, İstanbul");

        JavascriptExecutor jsx =(JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,400)","");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        permanentAddress.click();
        permanentAddress.sendKeys("Büyükada, İstanbul, Türkiye");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

        //first practice
        /*driver.manage().window().maximize(); //full Screen

        driver.get("https://www.google.com");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

        /*Timeouts
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS );
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Window
        driver.manage().window().maximize();
        */

        // 1.project
        /*WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Çağlar Çağatay CEYLAN");

        WebElement eMail = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"name@example.com\"]"));
        eMail.click();
        eMail.sendKeys("cagatayceylan026@gmail.com");

       WebElement currentAdress = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]"));
       currentAdress.click();
       currentAdress.sendKeys("Büyükada, İstanbul");

        JavascriptExecutor jsx =(JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,400)","");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        permanentAddress.click();
        permanentAddress.sendKeys("Büyükada, İstanbul, Türkiye");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();*/

    }
}

