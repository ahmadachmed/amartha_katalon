package com.aplus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class envSelect extends PageObject  {
	public envSelect(AppiumDriver<?> driver) {
		super(driver);
	}
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Button" )
	private WebElement btn_setting;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/tv_menu")
	private WebElement selectEnv;
	
	
}