package Procedures;

import org.openqa.selenium.remote.RemoteWebDriver;


import pageObjects.RegistrationPage;

public class RegistrationProcedures {

	public static void register(RemoteWebDriver driver, String firstname, String lastname, String email, String password, String d, String m, String v ) throws InterruptedException {
		
		RegistrationPage reg = new RegistrationPage(driver);
		reg.clickButton();
		  reg.setFirstname(firstname);
		  reg.setLastname(lastname);
		  reg.setEmail(email);
		  reg.setEmailConfirmation(email);
		  reg.setPassword(password);
		  reg.setDay(d);
		  reg.setMonth(m);
		  reg.setYear(v);
		  reg.setGender();
		  reg.clickSubmit();
		
	
//		Thread.sleep(1000);
	}
}
