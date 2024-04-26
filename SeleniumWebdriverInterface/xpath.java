package SeleniumWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class xpath {
    public WebDriver driver;
    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.actitime.com/free-online-trial");
    }



    @Test
    public void xpath() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sahil");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("khand");
        driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("hello@");
        driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("123");
    }

    @Test
    public void xpathFb() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hiiii");
//      driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
//        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        driver.findElement(By.xpath("//a[@class ='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();


    }

    @Test
    public void css(){
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Hii");
        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("hello");
        //driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
       driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();


    }

}
