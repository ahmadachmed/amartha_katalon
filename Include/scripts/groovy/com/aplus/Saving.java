package com.aplus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;

import io.appium.java_client.AppiumDriver;

public class Saving extends PageObject {
	public Saving(AppiumDriver<?> driver) {
		super(driver);
	}
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btn_mini_dashboard")
	private WebElement clickSaving;
	
	@FindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Nabung' or . = 'Nabung')]")
	private WebElement addSaving;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/textViewTooltipDescription")
	private WebElement tooltips;
	
	@FindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Ambil Uang' or . = 'Ambil Uang')]")
	private WebElement btn_withdrawal;
	
    public AddDeposit submit(){
		this.clickSaving.click();
        wait.until(ExpectedConditions.elementToBeClickable(tooltips));    
		MobileBuiltInKeywords.pressBack();;
		this.addSaving.click();
        return new AddDeposit(driver);
    }
    
    public Withdrawal confirm(){
		this.clickSaving.click();
        wait.until(ExpectedConditions.elementToBeClickable(tooltips));    
		MobileBuiltInKeywords.pressBack();;
		this.btn_withdrawal.click();
        return new Withdrawal(driver);
    }

}