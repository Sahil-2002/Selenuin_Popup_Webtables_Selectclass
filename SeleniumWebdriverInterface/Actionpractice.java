package SeleniumWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Actionpractice {
    public WebDriver driver;
    @Test
    public void contextclick() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
Thread.sleep(2000);
        Actions ac = new Actions(driver);
        WebElement email = driver.findElement(By.id("email"));
        ac.contextClick(email).perform();
    }
    @Test
    public void dragdrop() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement des = driver.findElement(By.xpath("//p[text() = 'Drop here']"));
        Actions ac = new Actions(driver);
        Thread.sleep(2000);
        //ac.dragAndDrop(src,des).perform();

        ac.moveToElement(src).clickAndHold().perform();
        ac.release(des).perform();

    }

    @Test
    public void doubleclick() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("sahil");
        WebElement email = driver.findElement(By.id("email"));
        Thread.sleep(2000);
       Actions ac = new Actions(driver);
       ac.doubleClick(email).perform();
    }

    @Test
    public void keyboard() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
       // driver.findElement(By.id("email")).sendKeys("sahil");
        Actions ac = new Actions(driver);
        ac.sendKeys("sahil").perform();
        Thread.sleep(2000);
        ac.keyDown(Keys.CONTROL).sendKeys("A").perform();
       ac.keyUp(Keys.CONTROL).perform();
        ac.keyDown(Keys.CONTROL).sendKeys("C").perform();
        ac.keyUp(Keys.CONTROL).perform();
        ac.keyDown(Keys.TAB).perform();
        ac.keyUp(Keys.TAB).perform();
        ac.keyDown(Keys.CONTROL).sendKeys("V").perform();
        ac.keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com/");
        ac.keyDown(Keys.CONTROL).sendKeys("V").perform();
        ac.keyUp(Keys.CONTROL).perform();
     ac.sendKeys("sahil 00000").perform();




    }

}

