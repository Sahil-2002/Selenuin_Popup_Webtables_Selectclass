package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;


public class Filedownload {

    @Test
    public  void test() throws InterruptedException {
        // Define Chrome preferences
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", "C:\\Users\\sahil\\Documents\\testing content"); // Specify the download directory

        // Assign Chrome preferences to ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        // Set ChromeOptions to disable popups and specify download directory
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the URL
        driver.get("https://www.autoitscript.com/site/autoit/downloads/");
     driver.findElement(By.xpath("//*[@id=\"post-77\"]/div/table[2]/tbody/tr[1]/td[2]/a/img")).click();
Thread.sleep(2000);
        // Close the browser
        driver.quit();
    }
}
