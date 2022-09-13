package com.aplus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.model.FailureHandling;

import io.appium.java_client.AppiumDriver;


public class PpobPage extends PageObject {
	public PpobPage (AppiumDriver<?> driver) {
		super(driver);
	}

	
//	@AndroidFindBy(accessibility = "")
//	private MobileElement buttonOfTheScreen;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Paket Data')]")
	private WebElement paketData;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/et_phone_number")
	private WebElement nomrPktData;
	
	@FindBy(xpath = "//android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.Button")
	private WebElement data50k;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/btnbayartabungan")
	private WebElement byrSaving;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Pulsa')]")
	private WebElement pulsa;
	
	@FindBy(xpath = "//android.widget.LinearLayout[7]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")
	public WebElement pulsa50k;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/phoneInput")
	private WebElement nomrPulsa;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Listrik')]")
	private WebElement pln;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/textView_spinner_text")
	private WebElement product_pln;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Token Listrik')]")
	private WebElement tokenPln;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Tagihan Listrik')]")
	private WebElement tagihanPln;
	
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/et_customer_id")
	private WebElement noMeter;
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/et_phone_number")
	private WebElement sendNoToken;
	@FindBy(xpath = "//*[contains(@text,'CEK TAGIHAN')]")
	private WebElement cektagihan;
	@FindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.Button")
	private WebElement token50k;
	
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'BPJS')]")
	private WebElement selectbpjs;
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/et_customer_id")
	private WebElement inputNoBPJS;
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/choose_month")
	private WebElement selectBlnPembayaran;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,\"PDAM\")]")
	private WebElement selectpdam;
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/tv_ppob_pdam_location")
	private WebElement selectlokasi;
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/et_search_location")
	private WebElement inputlokasi;
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/et_ppob_pdam_customer_id")
	private WebElement inputnopdam;
	@FindBy(id = "com.amarthaplus.amarthabeyond.uat:id/tv_check_invoice")
	private WebElement cektagihanpdam;
	
	
	public void selectPktData() {
        wait.until(ExpectedConditions.elementToBeClickable(paketData));
		this.paketData.click();
	}
	
	public void inputNomorPktData(String number) {
		this.nomrPktData.sendKeys(number);
	}
	
	public void inputNomorPulsa(String number) {
		this.nomrPulsa.sendKeys(number);
		MobileBuiltInKeywords.hideKeyboard();

	}
	
	public void pktData50k() {
        wait.until(ExpectedConditions.elementToBeClickable(data50k));
		this.data50k.click();
	}
	public void paySaving() {
		this.byrSaving.click();
	}
	
	public void selectPulsa() {
        wait.until(ExpectedConditions.elementToBeClickable(pulsa));
		this.pulsa.click();
	}
	
	public void pulsa50() {
		MobileBuiltInKeywords.hideKeyboard();
		MobileBuiltInKeywords.scrollToText("50000", FailureHandling.STOP_ON_FAILURE);
        wait.until(ExpectedConditions.elementToBeClickable(pulsa50k));       
        this.pulsa50k.click();
	}
	
	public void selectPLN() {
        wait.until(ExpectedConditions.elementToBeClickable(pln));       
        this.pln.click();
	}
	
	public void productPln(String product) {
        wait.until(ExpectedConditions.elementToBeClickable(product_pln));    
        this.product_pln.click();
        switch (product) {
        	case "prepaid":
        		this.tokenPln.click();
                wait.until(ExpectedConditions.elementToBeClickable(sendNoToken));       
        		this.sendNoToken.click();
        		this.sendNoToken.sendKeys("081234500001");
        		break;
        	case "postpaid":
        		this.tagihanPln.click();
        		break;
        }
		
	}
	
	public void inputNoMeter(String idpel) {
		this.noMeter.sendKeys(idpel);
	}
	
	public void selectToken(String token) {
        wait.until(ExpectedConditions.elementToBeClickable(token50k)); 
        switch (token) {
        	case "50000":
        		MobileBuiltInKeywords.scrollToText("50000", FailureHandling.STOP_ON_FAILURE);
        		this.token50k.click();
        		break;
        }		
	}
	
	public void cekTagihan() {
		MobileBuiltInKeywords.delay(3);
		MobileBuiltInKeywords.hideKeyboard();
		wait.until(ExpectedConditions.elementToBeClickable(cektagihan)); 
		this.cektagihan.click();
			
			
	}
	
	public void selectBPJS() {
        wait.until(ExpectedConditions.elementToBeClickable(selectbpjs));       
        this.selectbpjs.click();
	}
	
	public void inputnoBpjs(String nomor) {
        wait.until(ExpectedConditions.elementToBeClickable(selectbpjs));       
        this.inputNoBPJS.sendKeys(nomor);
	}
	
	public void bulanPembayaran(String month) {
        wait.until(ExpectedConditions.elementToBeClickable(selectBlnPembayaran));  
        this.selectBlnPembayaran.click();
        String bulan = "//android.widget.TextView[contains(@text,'"+month+"')]";
        driver.findElement(By.xpath(bulan)).click();
	}
	
	public void selectPDAM() {
        wait.until(ExpectedConditions.elementToBeClickable(selectpdam));  
        this.selectpdam.click();
	}
	
	public void selectLokasiPdam(String lokasi) {
        wait.until(ExpectedConditions.elementToBeClickable(selectlokasi));  
        this.selectlokasi.click();
        switch (lokasi) {
        	case "PDAM AETRA JAKARTA" :
        		this.inputlokasi.sendKeys("Aetra");
        		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'PDAM AETRA JAKARTA')]")).click();
        }
        
	}
	
	public void inputnoPDAM(String nomor) {
	    wait.until(ExpectedConditions.elementToBeClickable(inputnopdam));       
	    this.inputnopdam.sendKeys(nomor);
	}
	

	


	

}