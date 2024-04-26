package SeleniumWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SignUp {
    public WebDriver driver;
    public WebElement element;
    @BeforeMethod

    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
    }
@Test
    public void adddetails() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Sahil");
        driver.findElement(By.name("lastname")).sendKeys("Khandekar");
        driver.findElement(By.name("reg_email__")).sendKeys("9082164605");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
        driver.findElement(By.name("birthday_day")).sendKeys("10");
        driver.findElement(By.name("birthday_month")).sendKeys("November");
        driver.findElement(By.name("birthday_year")).sendKeys("2024");
       driver.findElement(By.xpath("//input[@value='2']")).click();
       driver.findElement(By.name("websubmit")).click();


    }

    @Test
    public void robot() throws AWTException, InterruptedException {
        Thread.sleep(3000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_S);



    }

}
