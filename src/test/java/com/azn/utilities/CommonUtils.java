package com.azn.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.azn.constants.ConfigConstants;
import com.azn.step_definitions.CommonStepDefinition;

public class CommonUtils {
	
	public static WebDriverWait wait = null;

	public static void loadProperties() {
		
		FileReader reader = null;		
		
			try {
				reader = new FileReader("config.properties");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		
		Properties properties = new Properties();
			try {
				properties.load(reader);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		
		ConfigConstants.BROWSER = properties.getProperty("BROWSER");
		ConfigConstants.CHROME_DRIVER_LOCATION = properties.getProperty("CHROME_BROWSER_LOCATION");
	}
	
	public static WebElement findElement(String string) {
		
		wait = new WebDriverWait(CommonStepDefinition.getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(string)));
		WebElement element = CommonStepDefinition.getDriver().findElement(By.xpath(string));
		return element;
	}
	
	public static void openUrl(String string) {
		
		CommonStepDefinition.getDriver().get(string);
	}

}
