package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Fileupload {
    public WebDriver driver;

    @Test
    public void upload() throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-converter");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div/label/form/label/div/div[2]/div[2]/button[1]/span")).click();
        Thread.sleep(2000);
        String filePath = "C:\\Users\\sahil\\Documents\\testing content\\Fileupload.exe";
        Runtime.getRuntime().exec(filePath);
        Thread.sleep(2000);

        driver.quit();
    }


}

