package SeleniumWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames {

    public WebDriver driver;

    @Test
    public void frames() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_border2");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("/html/body/p")).getText());
    }

    @Test
    public void html() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///D:/HTML%20tutorial/iframes2.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.id("t1")).sendKeys("sahil");
        driver.switchTo().parentFrame();
        Thread.sleep(2000);

        driver.findElement(By.id("t2")).sendKeys("Anil");
    }


}
