package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage {
	
	static RemoteWebDriver driver;
	
	 By username = By.id("email");
	 By password = By.id("pass");
	By loginButton = By.name("login");
	
	

        
	 public LoginPage(RemoteWebDriver driver){

	        this.driver = driver;

	    }
    
	
	public void setUsername (String x) {
		

		driver.findElement(username).sendKeys(x);
	}
	
	public  void setPassword (String y) {
		
		driver.findElement(password).sendKeys(y);
	}
	
	public void clickLogin() {
		
		driver.findElement(loginButton).click();
	}
}
