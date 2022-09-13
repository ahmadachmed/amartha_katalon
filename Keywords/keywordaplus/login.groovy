package keywordaplus
import org.openqa.selenium.JavascriptExecutor

import com.aplus.LoginPage
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import io.appium.java_client.AppiumDriver


class login {

	@Keyword
	def asMitra(String phoneNumber, String pin) {
		Mobile.startApplication("/Users/ahmadilham/Downloads/v1.23.0-minApi19-uat.apk", true)
		LoginPage login = new LoginPage(getCurrentSessionMobileDriver())
		login.skipNewInstall();
		login.loginMitra(phoneNumber)
		login.inputPinLogin(pin)
		Mobile.delay(3)
		//		Mobile.pressBack()
	}
	@Keyword
	def swipeDirection(String direction){
		JavascriptExecutor js = (JavascriptExecutor) getCurrentSessionMobileDriver()
		HashMap<String, String> scrollObject = new HashMap<String, String>()
		scrollObject.put("direction", direction)
		js.executeScript("mobile: swipe", scrollObject)
	}

	@Keyword
	def AppiumDriver getCurrentSessionMobileDriver() {
		return MobileDriverFactory.getDriver();
	}
}