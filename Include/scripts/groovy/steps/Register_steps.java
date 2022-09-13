package steps;
import io.appium.java_client.AppiumDriver;

import com.aplus.LoginPage;
import com.aplus.RegisterActivity;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_steps {
	public AppiumDriver<?> driver;
	public LoginPage login;
	public RegisterActivity register;

	@Given("Alice start open amartha+")
	public void alice_start_open_aplus_aplication() {
		MobileBuiltInKeywords.startApplication("/Users/ahmadilham/Downloads/v1.23.0-minApi19-uat.apk", true);
		driver = MobileDriverFactory.getDriver();
		login = new LoginPage(driver);
		login.registerAplus();
	}
	
	@Given("She click daftar")
	public void she_click_daftar() {
		register = new RegisterActivity(driver);
		register.asNonMitra();
	}
	
	@When("She register as non Mitra aplus")
	public void she_register_as_aplus() {
		register.inputOTP();
		register.createPin();
		register.inputPin();
		register.inputPin();
	}
	
	@Then("She available to see home aplus")
	public void she_available_to_see_home_aplus() {
		
	}
}