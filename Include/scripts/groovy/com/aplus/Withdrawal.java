package com.aplus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumDriver;

public class Withdrawal extends PageObject {
	public Withdrawal (AppiumDriver<?> driver) {
		super(driver);
	}
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/et_amount")
	private WebElement input_nominal;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btnConfirm")
	private WebElement confirm_withdraw;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btn_change")
	private WebElement ubah_popup;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btn_confirm")
	private WebElement confirm_popup;
	

	public void nominalSaving(String nominal) {
        wait.until(ExpectedConditions.elementToBeClickable(input_nominal));   
		this.input_nominal.clear();
		this.input_nominal.sendKeys(nominal);
	}
	
	public void confirmAmountWithdrawal() {
        wait.until(ExpectedConditions.elementToBeClickable(confirm_withdraw));  
		this.confirm_withdraw.click();
	}
	
	public void cancelCurrentAmount() {
        wait.until(ExpectedConditions.elementToBeClickable(ubah_popup));  
		this.ubah_popup.click();

	}
	
	
	public void confirmWithdrawal() {
        wait.until(ExpectedConditions.elementToBeClickable(confirm_withdraw));  
		this.confirm_withdraw.click();
        wait.until(ExpectedConditions.elementToBeClickable(confirm_popup));  
        this.confirm_popup.click();

		
	}
	
	public void failedWithdrawal() {
		ExpectedConditions.invisibilityOf(confirm_withdraw);
	}
	


}