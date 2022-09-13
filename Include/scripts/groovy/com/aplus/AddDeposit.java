package com.aplus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumDriver;

public class AddDeposit extends PageObject {
	public AddDeposit(AppiumDriver<?> driver) {
		super(driver);
	}
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/et_amount")
	private WebElement input_nominal;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/tv_confirm_saving")
	private WebElement confirm_saving;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btn_agen_amartha")
	private WebElement via_petugas;
	
	public void nominalSaving(String nominal) {
		if (this.via_petugas.isDisplayed()) {
			this.via_petugas.click();
		}
		
        wait.until(ExpectedConditions.elementToBeClickable(input_nominal));    
		this.input_nominal.sendKeys(nominal);
	}
	
	
	
	public void confirmDeposit() {
		this.confirm_saving.click();
	}
	
	public void failedDeposit() {
		ExpectedConditions.invisibilityOf(confirm_saving);
	}

}
