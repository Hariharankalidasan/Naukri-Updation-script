package com.Testbase;

import org.openqa.selenium.WebDriver;

public class BaseClass 
{

	private WebDriver driver;
	private DriverNaukri driverNaukri;
	
	public BaseClass() {
	driverNaukri = new DriverNaukri();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(String browsername) {
		this.driver = driverNaukri.launchBrowser(browsername);
	}
	
	
	
}