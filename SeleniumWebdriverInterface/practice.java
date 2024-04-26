package SeleniumWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.awt.*;
import java.nio.charset.StandardCharsets;

public class practice {
    public WebDriver driver;


    @BeforeMethod

    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
    }

//    @AfterMethod
//    public void close() {
//        driver.close();
//    }

    @Test
    public void getlocation() {
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        int y1 = email.getLocation().getX();
        System.out.println(y1);
        WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
        int y2 = pass.getLocation().getX();
        System.out.println(y2);
    }

    @Test
    public void getsize() {
        WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
        int height = element.getSize().getHeight();
        int width = element.getSize().getWidth();
        System.out.println(height + " " + width);

        WebElement ele = driver.findElement(By.xpath("//input[@id='pass']"));
        int h = ele.getSize().getHeight();
        int w = ele.getSize().getWidth();
        System.out.println(h+" "+w);
    }

    @Test
    public void clear() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hello");
        Thread.sleep(3000);
    String str = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value");
        System.out.println(str);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        WebElement a = driver.findElement(By.xpath("//input[@id='pass']"));
        String title = a.getAttribute("title");
        System.out.println(title);

    }
    @Test
    public void selected() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value=1]")).click();
        Thread.sleep(2000);
        WebElement value = driver.findElement(By.xpath("//input[@value=2]"));
        System.out.println(value.isSelected());

    }
    @Test
    public void Enabled() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("Hello");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("email")).getTagName());
        System.out.println(driver.findElement(By.id("email")).getAttribute("type"));

    }
    @Test
    public void cssvalue() throws InterruptedException {
        driver.findElement(By.name("login")).submit();
        Thread.sleep(2000);
        WebElement err = driver.findElement(By.xpath("//div[contains(text(),'The email address')]"));
        String error = err.getText();
        System.out.println(error);
        String c = err.getCssValue("font-weight");
        System.out.println(c);

    }



}
;