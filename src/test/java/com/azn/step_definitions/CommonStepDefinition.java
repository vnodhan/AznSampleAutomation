package com.azn.step_definitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.azn.constants.ConfigConstants;
import com.azn.utilities.CommonUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonStepDefinition {
	
	private static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		return driver;
	}

	@Before
	public void beforeScenario() {
		
		CommonUtils.loadProperties();
//		if (getDriver()==null) {
			launchBrowser();
//			}	
		
	}
	
	@After
	public void closeBrowser() {
			driver.quit();
	}
	
	public void launchBrowser() {
		
			switch (ConfigConstants.BROWSER){
			case "chrome":
//				System.setProperty("webdriver.chrome.driver",ConfigConstants.CHROME_DRIVER_LOCATION);
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
//				System.setProperty("webdriver.chrome.driver",ConfigConstants.FIREFOX_DRIVER_LOCATION
				WebDriverManager.firefoxdriver().setup();
				driver = new ChromeDriver();
				break;
				
			default:
//				System.setProperty("webdriver.chrome.driver",ConfigConstants.CHROME_DRIVER_LOCATION);
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
		}
		
		}
	
		
	}
	

