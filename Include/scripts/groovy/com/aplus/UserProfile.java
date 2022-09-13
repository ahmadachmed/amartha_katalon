package com.aplus;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UserProfile extends PageObject {
	public UserProfile(AppiumDriver<?> driver) {
		super(driver);
	}
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/tv_menu_profile")
	private MobileElement usermenu ;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btn_edit_profile")
	private MobileElement editprofile;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/tv_change_photo")
	private MobileElement changephoto;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/view_pick_image_gallery")
	private MobileElement selectFromGallery;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
	private MobileElement selectGooglePhotos;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout")
	private MobileElement selectPhotos;
	
	@AndroidFindBy(accessibility = "Photo taken on Apr 29, 2022 10:37:06 PM")
	private MobileElement selectedPhotos;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/tv_change_phone")
	private MobileElement changePhoneNumber;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/editText_edit_phone_input")
	private MobileElement inputPhoneNumber;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btn_next")
	private MobileElement clicknext;
	
	
	
	
	public void clickUserProfile() {
		this.usermenu.click();
	}
	
	public void editProfile() {
		this.editprofile.click();
	}
	
	public void selectFromGallery() {
		
		this.changephoto.click();
		this.selectFromGallery.click();
		this.selectGooglePhotos.click();
		this.selectPhotos.click();
		this.selectedPhotos.click();
	}
	
	public void updatePhoneNumber(String number) {
		this.changePhoneNumber.click();
		this.inputPhoneNumber.sendKeys(number);
		this.clicknext.click();
	}
}