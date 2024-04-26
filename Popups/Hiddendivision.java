package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hiddendivision {

    public WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select/option[103]")).click();
    }

    @Test
    public void irctc() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[4]/td[6]/a")).click();

    }
}
