package com.aplus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;

import io.appium.java_client.AppiumDriver;

public class HalamanBantuan extends PageObject {
	public HalamanBantuan(AppiumDriver<?> driver) {
		super(driver);
	}
	

	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/layout_app_guide")
	private WebElement panduanApp;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/tv_title_whatsapp")
	private WebElement viaWhatsapp;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/tv_title_phone")
	private WebElement viaTelp;
	
	public void selectBatuan(String bantuan) {
        wait.until(ExpectedConditions.elementToBeClickable(panduanApp));   
        switch (bantuan) {
        	case "Panduan Aplikasi":
        		this.panduanApp.click();
        		MobileBuiltInKeywords.delay(3);
        		break;
        	case "WA Martha Care":
        		this.viaWhatsapp.click();
        		MobileBuiltInKeywords.delay(3);

        		break;
        	case "Telpon Martha Care":
        		this.viaTelp.click();
        		MobileBuiltInKeywords.delay(3);

        		break;
        }

	}
	
	
	

}