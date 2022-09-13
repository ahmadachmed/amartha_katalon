package com.aplus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.util.KeywordUtil;

import io.appium.java_client.AppiumDriver;



public class ReceiptAplus extends PageObject{
	public ReceiptAplus(AppiumDriver<?> driver) {
		super(driver);
	}
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/textView_back")
	private WebElement btn_error_product;
	
	@FindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.amarthaplus.amarthabeyond.uat:id/tx_title']")
	private WebElement titleReceipt;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/tv_transaction_number_value")
	private WebElement savingNotrx;
	
	
	public String checkStatusTrx() {
		String result = null;
		
		if(driver.findElements( By.id("com.amarthaplus.amarthabeyond.uat:id/textView_back") ).size() != 0) {
			KeywordUtil.logInfo("Product tidak active");
			result = "product inactive";
		}
		else { 
			result = this.titleReceipt.getText(); 
			
		}
		return result;
	}
	
	public String checkNoTrxSaving() {
		return this.savingNotrx.getText();
	}
	
	public void histroryWithdrawalTrx(String trx) {
		String noTrx = trx;
		if (driver.findElement(By.id("com.amarthaplus.amarthabeyond.uat:id/btn_close")).isDisplayed()) {
			driver.findElement(By.id("com.amarthaplus.amarthabeyond.uat:id/btn_close")).click();
		} else {
			MobileBuiltInKeywords.pressBack();
		}
		driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = '"+noTrx+"' or . = '"+noTrx+"') and @resource-id = 'com.amarthaplus.amarthabeyond.uat:id/tv_status_transaction_code']")).click();
	}
	
	public void historyTrx(String trx) {
		String noTrx = "0000" + trx;
//		if (driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = 'Mau nabung berapa?' or . = 'Mau nabung berapa?')]")).isDisplayed()) {
//			MobileBuiltInKeywords.hideKeyboard();
//			MobileBuiltInKeywords.pressBack();
//		}
		
		if (driver.findElement(By.id("com.amarthaplus.amarthabeyond.uat:id/btn_agen_amartha")).isDisplayed()) {
			MobileBuiltInKeywords.pressBack();
		}
		
		
		if (driver.findElement(By.id("com.amarthaplus.amarthabeyond.uat:id/tv_mutation_list")).isDisplayed()) {
			driver.findElement(By.id("com.amarthaplus.amarthabeyond.uat:id/tv_mutation_list")).click();
		} else {
			System.out.println("no history transaction");
		}
		
		MobileBuiltInKeywords.scrollToText(noTrx);
		driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and (@text = '"+noTrx+"' or . = '"+noTrx+"') and @resource-id = 'com.amarthaplus.amarthabeyond.uat:id/tv_status_transaction_code']")).click();
	}

}