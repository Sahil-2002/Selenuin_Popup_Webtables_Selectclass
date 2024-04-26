package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascriptpopup {
public WebDriver driver;
    @Test
    public void alert() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("alertButton")).click();
       String str =  driver.switchTo().alert().getText();
        System.out.println(str);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }
    @Test
    public void confirmation() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("confirmButton")).click(); // Changed xpath to id
        Alert alert = driver.switchTo().alert(); // Switching to the alert
        Thread.sleep(2000);
        String str = alert.getText(); // Getting text from the alert
        System.out.println(str);
        alert.accept(); // Accepting the alert
        driver.quit(); // Quitting the driver
    }

    @Test
    public void prompt() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("promtButton")).click();
Alert alert = driver.switchTo().alert();
alert.sendKeys("Sahil");
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();


    }


}
