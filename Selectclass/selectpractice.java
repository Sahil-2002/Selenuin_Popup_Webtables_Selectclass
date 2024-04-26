package Selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class selectpractice {

    public WebDriver driver ;

    @Test
    public void test() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/selectclass.html");

        WebElement id = driver.findElement(By.id("mtr"));
        Select sc = new Select(id);
        List<WebElement>option = sc.getOptions();
        System.out.println("total options are : "+option.size());
        System.out.println("printing all options ");
        for(WebElement values : option){
            System.out.println(values.getText());
        }
        System.out.println("------------------");

// selection

        sc.selectByValue("D");
        sc.selectByIndex(0);
        sc.selectByVisibleText("PANI");

        boolean check = sc.isMultiple();
        if(check){
            System.out.println("this is multiple select box ");
        }
        List<WebElement> all = sc.getAllSelectedOptions();
        for(WebElement n : all){
            System.out.println("selected options is :"+n.getText());
        }
        WebElement first = sc.getFirstSelectedOption();
        System.out.println("first selected option is "+first.getText());

Thread.sleep(2000);
// Deselection

        sc.deselectByIndex(0);
        sc.deselectByValue("D");
        sc.deselectByVisibleText("PANI");
        sc.deselectAll();

    }
}
