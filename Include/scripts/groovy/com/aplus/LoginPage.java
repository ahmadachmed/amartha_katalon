package com.aplus;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class LoginPage extends PageObject {
	public LoginPage(AppiumDriver<?> driver) {
		super(driver);
	}
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btn_next")
	private WebElement BERIKUTNYA;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btn_start")
	private WebElement MULAI;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/textView_onboarding_login")
	private WebElement YUK_MASUK;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/textView_onboarding_register")
	private WebElement BELUM_PUNYA_AKUN;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/editText_login_phone_input")
	private WebElement LOGIN_PHONE;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btn_next")
	private WebElement BTN_SELANJUTNYA;
	
	@FindBy(xpath = "android.widget.TextView[contains(@text,'Non-Mitra Amartha')]")
	private WebElement ERR_Phonenumber;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/textView_pin_section")
	private WebElement PIN_Header;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/textView_onboarding_help")
	private WebElement btn_bantuan;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/error_message")
	private WebElement ERR_PIN;
	
	

    public HalamanBantuan submit(){
		this.BERIKUTNYA.click();
		new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.id("com.amarthaplus.amarthabeyond.uat:id/btn_next"))); 
		this.BERIKUTNYA.click();
		this.MULAI.click();
    	btn_bantuan.click();

        return new HalamanBantuan(driver);

    }
	
	public void skipNewInstall() {
		this.BERIKUTNYA.click();
		new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.id("com.amarthaplus.amarthabeyond.uat:id/btn_next")));  
		this.BERIKUTNYA.click();
		this.MULAI.click();
		this.YUK_MASUK.click();
	}
	
	public void registerAplus() {
		this.BERIKUTNYA.click();
		new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.id("com.amarthaplus.amarthabeyond.uat:id/btn_next")));
		this.BERIKUTNYA.click();
		this.MULAI.click();
		this.BELUM_PUNYA_AKUN.click();
	}
	
	public void loginMitra(String phonenumber){
		this.LOGIN_PHONE.sendKeys(phonenumber);
		this.BTN_SELANJUTNYA.click();	
	}
	
	public void inputPinLogin(String pin) {
		String listpin = pin;
		
        List<Character> chars = new ArrayList<>();
        for (char ch : listpin.toCharArray()) {
        	chars.add(ch);
            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+ch+"')]")).click();
        }
	}
	
    public String errorHeader(){
        return ERR_Phonenumber.getText();
    }
    
    public String pinHeader() {
    	return PIN_Header.getText();
    }
    
    public String errorPin() {
    	return ERR_PIN.getText();
    }
    
    public void closeApp() {
    	driver.closeApp();
    }
	
}