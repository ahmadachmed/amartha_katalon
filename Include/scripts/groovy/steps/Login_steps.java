package steps;
import com.aplus.LoginPage;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

import static org.junit.Assert.assertEquals;



public class Login_steps {
	public AppiumDriver<?>  driver;
	public LoginPage login;
	
	
	
	@Given("Alice start open aplus aplication")
	public void alice_start_open_aplus_aplication() {
		MobileBuiltInKeywords.startApplication("/Users/ahmadilham/Downloads/v1.23.0-minApi19-uat.apk", true);
		driver = MobileDriverFactory.getDriver();
		login = new LoginPage(driver);
		login.skipNewInstall();
	}
	@When("she login using phone number (.*)")
	public void she_login_using_phone_number(String phonenumber) {
		login.loginMitra(phonenumber);
	}
	@Then("she should see that has message (.*)")
	public void she_should_see_that_has_message(String outcome) {
		if (outcome == "succedeed") {
			assertEquals("Masukkan PIN", login.pinHeader());	
		}
		if (outcome == "failed") {	
	        assertEquals("Record not found", login.errorHeader());		
		}
	}
	
	
	@When("she input her pin (.*)")
	public void she_input_her_pin(String pin) {
		login.inputPinLogin(pin);
	}
	
	@Then("she should see logged as (.*)")
	public void she_should_see_logged(String user) {
		if (user == "Mitra") {
			
		}
		if (user == "NonMitra") {
			
		}
	}
	@Then("she should see that error message (.*)")
	public void she_should_see_that_error_message(String message) {
		assertEquals(message, login.errorPin());
		login.closeApp();
	}
	

}