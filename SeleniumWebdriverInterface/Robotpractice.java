package SeleniumWebdriverInterface;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Robotpractice {
    private WebDriver driver;

    @Test
    public void testkeyboard() throws AWTException, InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_S);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_A);
        Thread.sleep(1000); // Introduce a small delay
        r.keyRelease(KeyEvent.VK_S);
        Thread.sleep(1000); // Introduce a small delay
        r.keyRelease(KeyEvent.VK_A);
        Thread.sleep(1000); // Introduce a small delay


        // copy
        r.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(1000); // Introduce a small delay
        r.keyPress(KeyEvent.VK_A);
        Thread.sleep(1000); // Introduce a small delay
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000); // Introduce a small delay
        r.keyRelease(KeyEvent.VK_A);
        Thread.sleep(1000); // Introduce a small delay
        // tab
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
       // Thread.sleep(2000);

        //paste
        r.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        r.keyPress(KeyEvent.VK_V);
        Thread.sleep(1000);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        r.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
       // Thread.sleep(2000);
        //driver.close();

    }
    @Test
    public void testmouse() throws AWTException, InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Robot r = new Robot();
        driver.manage().window().maximize();
        r.mouseMove(250 ,300);
        Thread.sleep(3000);
        r.mouseWheel(5);


    }

}

