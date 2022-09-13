package com.aplus;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;

import io.appium.java_client.AppiumDriver;


public class RegisterActivity extends PageObject {
	public RegisterActivity (AppiumDriver<?> driver) {
		super(driver);
	}
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/et_phone_number")
	private WebElement input_phone_number;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/textView_onboarding_register")
	private WebElement btn_register;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/et_account_name")
	private WebElement input_nama_mitra;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/checkBox_tnc")
	private WebElement checkBox_tnc;
	
	@FindBy(xpath = "//*[contains(@text,'DAFTAR')]")
	private WebElement DAFTAR;
	
	@FindBy(xpath = "//*[contains(@text,'Buat PIN Baru')]")
	private WebElement btn_create_pin;
	
	@FindBy(xpath = "//*[contains(@text,'Selesai')]")
	private WebElement Selesai;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/menu_home_page")
	private WebElement HOME;

	
	public void asNonMitra() {
		MobileBuiltInKeywords.hideKeyboard();
        wait.until(ExpectedConditions.elementToBeClickable(input_phone_number));   
        int min = 0000;  
        int max = 9999;  
        int b = (int)(Math.random()*(max-min+1)+min);  
        String phoneNum = "08123450" + Integer.toString(b);
        this.input_phone_number.sendKeys(phoneNum);
        this.Selesai.click();
//		MobileBuiltInKeywords.hideKeyboard();
//        wait.until(ExpectedConditions.elementToBeClickable(BUKAN_MITRA));   
//        this.BUKAN_MITRA.click();
        String mitra_name = "Automation" + Integer.toString(b);
        this.input_nama_mitra.click();
        this.input_nama_mitra.sendKeys(mitra_name);
		MobileBuiltInKeywords.hideKeyboard();
		this.checkBox_tnc.click();
		this.DAFTAR.click();  
	}
	
	public void inputOTP() {
		String listOTP = "1234";
		
        List<Character> chars = new ArrayList<>();
        for (char ch : listOTP.toCharArray()) {
        	chars.add(ch);
            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+ch+"')]")).click();
        }
	}
	
	public void createPin() {
        wait.until(ExpectedConditions.elementToBeClickable(btn_create_pin));   
		this.btn_create_pin.click();
	}
	
	public void inputPin() {
		String listPin = "123654";
		
        List<Character> chars = new ArrayList<>();
        for (char ch : listPin.toCharArray()) {
        	chars.add(ch);
            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+ch+"')]")).click();
        }
	}
	
	public void validateHomepage() {
		wait.until(ExpectedConditions.elementToBeClickable(HOME));
	}
	
}