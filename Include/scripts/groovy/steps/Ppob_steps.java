package steps;
import com.aplus.PpobPage;
import com.aplus.ReceiptAplus;
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory;
import com.kms.katalon.core.util.KeywordUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;


public class Ppob_steps {
	public AppiumDriver<?>  driver;
	public PpobPage ppob;
	public ReceiptAplus receipt;
	
	@Given("Alisa open aplus application")
	public void Alisa_open_aplus_application() {
		new keywordaplus.login().asMitra("085700088352", "123698");
		driver = MobileDriverFactory.getDriver();
		ppob = new PpobPage(driver);
		receipt = new ReceiptAplus(driver); 

	}
	@Given("she select ppob (.*)")
	public void she_select_ppob(String product)  {
		if (product.equals("Paketdata")) {
			ppob.selectPktData();
		}
		if (product.equals("Pulsa")) {
			ppob.selectPulsa();
		}
		if (product.equals("PLN")) {
			ppob.selectPLN();
		}
		if (product.equals("BPJS")) {
			ppob.selectBPJS();
		}
		if (product.equals("PDAM")) {
			ppob.selectPDAM();
		}
	}
	@Given("she input phone number paket data (.*)")
	public void she_input_phone_number_paketdata(String phone) {
		ppob.inputNomorPktData(phone);
	}
	
	@Given("she input phonenumber (.*)")
	public void she_input_phone_pulsa(String phone) {
		ppob.inputNomorPulsa(phone);
	}
	
	@Given("she select paket data nominal (.*)")
	public void she_select_nominal(String nominal) {
		if (nominal.equals("50000")) {
			ppob.pktData50k();
		}
		
	}
	
	@Given("she select nominal pulsa (.*)")
	public void she_select_nominal_pulsa(String nominal) {
		if (nominal.equals("50000")) {
			ppob.pulsa50();
		}
	}
	
	@When("she pay with her saving account")
	public void she_pay_with_saving() {
		ppob.paySaving();
		new com.aplus.LoginPage(driver).inputPinLogin("123698");
	}
	
	@Then("she should see that receipt transaction has (.*)")
	public void she_should_see_that_receipt_transaction_has(String outcome) {
		if (outcome.equals("Success")) {
			KeywordUtil.logInfo(receipt.checkStatusTrx());
		}
	}
	
	@Given("she select type tagihan pln (.*)")
	public void she_select_type_tagihan_pln(String product) {
		ppob.productPln(product);
	}
	
	@Given("she input id pln (.*)")
	public void she_input_id_pln(String nometer) {
		ppob.inputNoMeter(nometer);
	}
	
	@Given("She select nominal token (.*)")
	public void She_select_nominal_token(String token) {
		ppob.selectToken(token);
	}
	
	@Given("she click cek tagihan")
	public void she_click_cek_tagihan() {
		ppob.cekTagihan();
	}
	
	@Given("she input no bpjs (.*)")
	public void she_input_no_bpjs(String nomor) {
		ppob.inputnoBpjs(nomor);
	}
	
	@Given("she select bulan pembayaran (.*)")
	public void she_select_bulan_pembayaran(String month) {
		ppob.bulanPembayaran(month);
	}
	
	@Given("she select area pdam (.*)")
	public void she_select_area_pdam(String area) {
		ppob.selectLokasiPdam(area);
	}
	
	@Given("she input no pdam (.*)")
	public void she_input_no_pdam(String nomor) {
		ppob.inputnoPDAM(nomor);
	}

}