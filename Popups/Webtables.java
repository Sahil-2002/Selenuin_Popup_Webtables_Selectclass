package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Webtables {
    public WebDriver driver;

    @Test
    public void table() {

        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/tables.html");
        // total rows
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        System.out.println("Total no of rows " + rows.size());
        // total columns
        List<WebElement> columns = driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
        System.out.println("no. of columns are :" + columns.size());
        // total cells
        List<WebElement> cells = driver.findElements(By.xpath("/html/body/table/tbody/th|//td"));
        System.out.println("total cells " + cells.size());
int count =0;
int sum =0;
        for(WebElement data : cells){
            String value = data.getText();
            {
try {
    int num = Integer.parseInt(value);
    System.out.println(num);
    count++;
    sum = sum + num;

}
catch (Exception e){

}

            }


        }
        System.out.println("sum is " + sum);
        System.out.println("count of no is "+count);

    }

}
