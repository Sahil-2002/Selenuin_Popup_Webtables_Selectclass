package SeleniumWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jsexecutor {
    public WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('email').value = 'Sahil'");
        js.executeScript("document.getElementById('pass').value = 'Anil'");
        //js.executeScript("document.getElementById('t2').type = 'button'");
        Thread.sleep(3000);
        for (int i = 1; i < 5; i++) {
//scroll down on the webpage
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        for (int i = 1; i < 5; i++) {
//scroll up on the webpage
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }
    }

    @Test
    public void scroll() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_5twasf2d2w_e&adgrpid=1318316051640309&hvadid=82395019828275&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=116073&hvtargid=kwd-82395637438085:loc-90&hydadcr=5652_2377259");
        JavascriptExecutor js = (JavascriptExecutor)driver;
       WebElement ele =  driver.findElement(By.className("navFooterColHead"));
       int x = ele.getLocation().getX();
       int y = ele.getLocation().getY();
        System.out.println(x+" "+y);
        js.executeScript("window.scrollBy(" + x + ", " + y + ")");

    }

    @Test
    public void html() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///D:/HTML%20tutorial/jsexecutor.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('t1').value= 'Sahil'");
        js.executeScript("document.getElementById('t2').value = 'Anil'");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t1').type = 'button'");
        js.executeScript("window.scrollBy(0,500)");

    }


}



