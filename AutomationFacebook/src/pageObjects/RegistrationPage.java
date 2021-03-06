package pageObjects;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	static RemoteWebDriver driver;
	
	By createAccountButton = By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']");
	By firstName = By.name("firstname");
	By lastName = By.name("lastname");
	By email = By.name("reg_email__");
	By password = By.name("reg_passwd__");
	By emailConfirmation = By.name("reg_email_confirmation__");
	By day = By.id("day");
	By month = By.id("month");
	By year = By.id("year");
	By gender= By.xpath("//input[@type='radio' and @value='2']");
	By submit = By.name("websubmit");	
	 public RegistrationPage(RemoteWebDriver driver){

	        this.driver = driver;

	    }
 
	
	public void setFirstname (String x) {
		System.out.println("lets enter Firstname");

		driver.findElement(firstName).sendKeys(x);
	}
	
	public void setLastname (String w) {
		System.out.println("lets enter Lastname");

		driver.findElement(lastName).sendKeys(w);
	}
	
	public void setEmail (String z) {
		System.out.println("lets enter email");

		driver.findElement(email).sendKeys(z);
	}
	
	public void setEmailConfirmation (String e) {
		System.out.println("lets enter emailConfirmation");

		driver.findElement(emailConfirmation).sendKeys(e);
	}
	
	public  void setPassword (String y) {
		System.out.println("lets enter password");
		driver.findElement(password).sendKeys(y);
	}
	
	public  void setDay (String d) {
		
		WebElement dateElement = driver.findElement(day);
		Select dateDropDown = new Select(dateElement);
		dateDropDown.selectByVisibleText(d);;
	}
	
	public  void setMonth (String m) {
		
		WebElement monthElement =driver.findElement(month);
		Select monthDropDown = new Select(monthElement);
		monthDropDown.selectByVisibleText(m);;
	}
	
	public  void setYear (String v) {
		
		WebElement yearElement =driver.findElement(year);
		Select yearDropDown = new Select(yearElement);
		yearDropDown.selectByVisibleText(v);
	}
	
	public void setGender() {
		driver.findElement(gender).click();
	}
	
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
	public void clickButton() {
		System.out.println("Click create");
		driver.findElement(createAccountButton).click();
	}

}
