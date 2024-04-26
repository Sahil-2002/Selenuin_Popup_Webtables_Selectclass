package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.Set;

public class Childbrowser {

    public WebDriver driver;
    @Test
    public void window() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.get("https://www.google.com/");
        Set<String>set = driver.getWindowHandles();
        System.out.println("total windows "+set.size());

        for(String window : set){
            driver.switchTo().window(window);
            String title = driver.getTitle();
            System.out.println(title+" "+window);
            driver.close();
        }




    }

    @Test
    public void close() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Set<String> set = driver.getWindowHandles();
        String x = driver.getWindowHandle();
        System.out.println("no. of windows "+set.size());
        for(String window : set){

            System.out.println(window);
            System.out.println(driver.getTitle());
            driver.findElement(By.id("email")).sendKeys("sahil");


            if(window.equals(x)){

                System.out.println(window);
                Thread.sleep(2000);


                driver.close();

            }


        }





    }

}
