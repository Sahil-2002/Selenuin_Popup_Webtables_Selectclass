package SeleniumWebdriverInterface;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Login {
 public WebDriver driver;
@BeforeMethod
public void setup(){
 driver = new ChromeDriver();
 driver.get("https://www.facebook.com/");

 }
 @Test
 public void getdetails () throws InterruptedException {

  driver.manage().window().maximize();   // manage
  String title = driver.getTitle();      // get title
  System.out.println(title);
  String URL = driver.getCurrentUrl();     // get current url
  System.out.println("url is "+URL);
  String sc = driver.getPageSource();      // get page source
  System.out.println(sc);
  Thread.sleep(3000);
driver.close();

 }

 @Test
 public  void getwindowhandle() throws InterruptedException {
//  driver = new ChromeDriver();
//  driver.get("https://www.facebook.com/");
  Thread.sleep(3000);
  driver.get("https://www.google.com/");
  String a = driver.getWindowHandle();    // get window handle
  System.out.println("Window handle is "+a);
  driver.close();
 }
@Test
 public void navigate() throws InterruptedException {
//  driver = new ChromeDriver();
//  driver.get("https://www.facebook.com/");
  Thread.sleep(3000);
  driver.manage().window().maximize();
  driver.navigate().to("https://www.google.com/");
  Thread.sleep(3000);
  driver.navigate().back();
 Thread.sleep(3000);
 driver.navigate().forward();
 Thread.sleep(3000);
 driver.navigate().refresh();
 Thread.sleep(3000);
driver.close();

 }
 @Test
 public void login(){
  driver.findElement(By.name("email")).sendKeys("sahil@gmail.com");
  driver.findElement(By.name("pass")).sendKeys("sahil");
  driver.findElement(By.name("login")).click();
  driver.close();
}

@Test
public void forgotpassword(){
 driver.findElement(By.linkText("Forgotten password?")).click();
}

@Test
 public void create(){
driver.findElement(By.linkText("Create new account")).click();

}
}
