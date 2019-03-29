package testng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyphpsiteTest {
    WebDriver driver;
   @BeforeMethod
   public void launch()
   {
       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.get("http://192.168.0.101/index.php");    
   }
   @Test
   public void about() {
       driver.findElement(By.xpath("//a[@id='About Us']")).click();
   }
   @AfterMethod
   public void close()
   {
      //driver.close();
   }
}
