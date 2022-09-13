package com.aplus;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class OtpAplus extends PageObject {
	public OtpAplus (AppiumDriver<?> driver) {
		super(driver);
	}
	public void inputOTP(String otp) {
		String listpin = otp;
        for (char ch : listpin.toCharArray()) {
            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+ch+"')]")).click();
        }
	}

}