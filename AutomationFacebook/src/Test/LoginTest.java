package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import pageObjects.LoginPage;
import Procedures.LoginProcedures;

public class LoginTest {
	
	RemoteWebDriver driver;
	
	
  @Test(dataProvider = "getData")
  public void login(String username2, String password) throws InterruptedException, IOException {
	  
	  
	  LoginProcedures test = new LoginProcedures(); 
      test.loginWithUser(driver, username2, password);
      String url = driver.getCurrentUrl();
      Assert.assertEquals(url, "https://www.facebook.com/?sk=welcome");
     
  }
  
  
  @BeforeClass
  public void beforeMethod() {
	  
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\chromedriver.exe");
	   driver =new ChromeDriver(options);
		
		 
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		  
		//*open the site*
			  
		      driver.get("https://www.facebook.com");
		      driver.manage().window().maximize();
		 
  }

  @AfterClass
  public void afterMethod() {
	  
	  //driver.quit();
  }


  
  @DataProvider(name="getData")
  public Object[][] getData(){
   //Object [][] data = new Object [rowCount][colCount];
   Object [][] data = new Object [1][2];
   
   data [0][0] = "rhxljkbpvz_1618669026@tfbnw.net";
   data [0][1] = "JA123456789";
   
   return data;
}
}
