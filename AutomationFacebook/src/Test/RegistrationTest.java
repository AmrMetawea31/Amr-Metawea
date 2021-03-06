package Test;

import org.testng.annotations.Test;


	

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
	
import Procedures.RegistrationProcedures;

	public class RegistrationTest {
		
		RemoteWebDriver driver;
		
		
	  @Test(dataProvider = "getData")
	  public void registerTest(String firstname,String lastname, String email, String password,String day, String month, String year) throws InterruptedException, IOException {
		  
		  
		  RegistrationProcedures test = new RegistrationProcedures(); 
	      test.register(driver, firstname, lastname, email, password, day, month, year);
//	      String url = driver.getCurrentUrl();
//	      Assert.assertEquals(url, "https://www.facebook.com/?sk=welcome");
	     
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
	   Object [][] data2 = new Object [1][7];
	   
	   data2 [0][0] = "Tester";
	   data2 [0][1] = "user";
	   data2 [0][2] = "testeruser@gmail.com";
	   data2 [0][3] = "am12345678";
	   data2 [0][4] = "31";
	   data2 [0][5] = "Jan";
	   data2 [0][6] = "1993";
	   
	   return data2;
	}
	}
