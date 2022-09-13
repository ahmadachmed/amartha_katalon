package steps;
import com.aplus.HalamanBantuan;
import com.aplus.LoginPage;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class PusatBantuan_steps {
	public AppiumDriver<?>  driver;
	public LoginPage login;
	public HalamanBantuan pusatbantuan;
	
	@Given("Page start open aplus app")
	public void Page_start_open_aplus_app() {
		MobileBuiltInKeywords.startApplication("/Users/ahmadilham/Downloads/v1.23.0-minApi19-uat.apk", true);
		driver = MobileDriverFactory.getDriver();
		login = new LoginPage(driver);
	}
	
	@Given("She tap butuh bantuan in login page")
	public void She_tap_butuh_bantuan() {
		pusatbantuan = login.submit();
	}
	
	@When("She pick (.*) in pusat bantuan")
	public void She_pick_in_pusat_bantuan(String type) {
		pusatbantuan.selectBatuan(type);
	}
	@Then("She available to follow up (.*) bantuan from pusat bantuan")
	public void She_available_pusat_bantuan(String status) {
		
	}

}