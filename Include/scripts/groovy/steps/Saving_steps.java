package steps;
import com.aplus.AddDeposit;
import com.aplus.ReceiptAplus;
import com.aplus.Saving;
import com.aplus.Withdrawal;
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class Saving_steps {
	public AddDeposit deposit;
	public Withdrawal wd;
	String pin = "123698";
	
	
	AppiumDriver<?> driver = MobileDriverFactory.getDriver();
	Saving saving = new Saving(driver);
	ReceiptAplus receipt = new ReceiptAplus(driver);
	
	@Given("she click add tabungan")
	public void She_click_add_tabungan() {	
		deposit = saving.submit();
	}
	
	@Given("she click withdrawal tabungan")
	public void she_click_withdrawal_tabungan() {
		wd = saving.confirm();
	}
	
	@Given("she click confirm withdrawal amount")
	public void she_click_confirm_withdrawal_amount() {
		wd.confirmAmountWithdrawal();
	}
	
	@When("she cancel and update amount (.*) withdrawal")
	public void she_cancel_and_update_amount_withdrawal(String amount) {
		wd.cancelCurrentAmount();
		wd.nominalSaving(amount);
	}
	
	@When("she input amount (.*) withdrawal")
	public void input_withdrawal(String amount) {
		wd.nominalSaving(amount);
	}
	
	@When("she click no transactions (.*) in history")
	public void she_click_no_transactions_in_history(String trxid) {
		receipt.historyTrx(trxid);
		
	}
	
	@Then("she has been (.*) check receipt")
	public void she_has_been_check_receipt(String status) {
		if (status.equalsIgnoreCase("success")) {
			receipt.checkNoTrxSaving();
		}
	}
	
	@Then("she click confirmation withdrawal status should be (.*)")
	public void she_click_confirmation_withdrawal_status(String status) {
		
		
		if (status.equalsIgnoreCase("success")) {
			wd.confirmWithdrawal();
			new com.aplus.LoginPage(driver).inputPinLogin(pin);
		}
		if (status.equalsIgnoreCase("failed")) {
			wd.failedWithdrawal();
		}
	}
	
	@Then("she check history last withdrawal transaction")
	public void check_history_last_withdrawal_transaction() {
		final String notransaction = receipt.checkNoTrxSaving();
		receipt.histroryWithdrawalTrx(notransaction);
	}
	
	@When("she input (.*) to saving")
	public void she_input_to_saving(String amount) {
		deposit.nominalSaving(amount);
	}
	
	@Then("she click confirmation saving status should be (.*)")
	public void she_click_confirmation_saving_status(String status) {
		if (status.equalsIgnoreCase("success")) {
			deposit.confirmDeposit();
		}
		if (status.equalsIgnoreCase("failed")) {
			deposit.failedDeposit();
		}
	}
	

}