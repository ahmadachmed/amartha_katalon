package com.aplus;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class PageObject {
    private static final int TIMEOUT = 5;
    private static final int POLLING = 15;
	
	protected AppiumDriver<?> driver;
    public WebDriverWait wait;
	
	public PageObject(AppiumDriver<?> driver){
		this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(driver, this);	}
}