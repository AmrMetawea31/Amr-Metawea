package Procedures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import pageObjects.LoginPage;



public class LoginProcedures {
	
	public static void loginWithUser(RemoteWebDriver driver, String username, String password) throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		  login.setUsername(username);
		  login.setPassword(password);
		  login.clickLogin();

		
	
//		Thread.sleep(1000);
	}

}
