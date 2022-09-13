package steps;
import com.aplus.LoginPage;
import com.aplus.UserProfile;
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;

public class UserProfiles_step  {
	public UserProfile profile;
	public AppiumDriver<?>  driver;
	public LoginPage login;
	
	
	
	@Given("Kryposa open aplus application")
	public void _start_open_aplus_aplication() {
		new keywordaplus.login().asMitra("081289945245", "123654");
		driver = MobileDriverFactory.getDriver();
		profile = new UserProfile(driver);
	}
	
	@Given("she click profile icon bottom apps")
	public void she_click_profile_icon_bottom_apps(){
		profile.clickUserProfile();
	}
	
	@Given("she click edit user profile")
	public void she_click_edit_user_profile() {
		profile.editProfile();
	}
	
	@Given("she update photo from (.*) in android")
	public void she_update_photo_from_in_android(String gallery) {
		if (gallery.equals("Google Photos")) {
			profile.selectFromGallery();
		}
	}
	
	@Then("she should see that her (.*) profile photo is update")
	public void she_should_see_that_her_profile_photo_is_update(String status) {
		
	}
	
	@Then("she update her (.*) phone")
	public void she_update_her_phone(String number) {
		profile.updatePhoneNumber(number);
	}
}