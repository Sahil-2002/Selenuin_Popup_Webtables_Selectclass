package SeleniumWebdriverInterface;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.FileHandler;

public class Screenshot {
public WebDriver driver;
    @Test
    public void take() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("D:\\intellij_workspace\\SeleniumTask\\screenshot","fb1.png");
        Files.copy(src.toPath(), des.toPath());
    }

}
