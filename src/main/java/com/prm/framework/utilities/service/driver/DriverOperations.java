package com.prm.framework.utilities.service.driver;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.prm.framework.utilities.service.properties.PropertiesFileOperations;

public class DriverOperations {

	public void loadChromeDriver(String chromeDriverKey, String chromeDriverValue, List<String> keyValue) {


		try {
			if(chromeDriverKey.equals("browser.isChromeDriverEnable") && chromeDriverValue.equals("Yes")) {

				System.out.println("Chrome Driver loaded successfully");
				
				int chromeDriverLocationIndex = 2;
				
				PropertiesFileOperations propertiesFile = new PropertiesFileOperations();
				
				String chromeDriverLocation = propertiesFile.retrieveSingleKeyValueUsingIndex(keyValue, chromeDriverLocationIndex);
				
				System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
				
				WebDriver chromeDriver = new ChromeDriver();
				
				chromeDriver.get("https://www.javatpoint.com");
				
				
				
				
				
			}
			else {
				
				System.out.println("Chrome Driver is not enabled");
			}

		}
		catch(NullPointerException e) {

			System.out.println("Key and value is not matching");
		}

	}
	public void loadGekoDriver(String gekoDriverKey, String gekoDriverValue) {
		
		try {
			if(gekoDriverKey.equals("browser.isGekoDriverEnable") && gekoDriverValue.equals("Yes")) {

				System.out.println("Geko Driver loaded successfully");
			}

		}
		catch(NullPointerException e) {

			System.out.println("Key and value is not matching");

		}

	}
	public void loadIeDriver(String ieDriverKey, String ieDriverValue) {
		try {
			if(ieDriverKey.equals("browser.isInternetExplorerEnable") && ieDriverValue.equals("Yes")) {

				System.out.println("IE Driver loaded successfully");

			}
		}
		catch(NullPointerException e) {

			System.out.println("Key and value is not matching");

		}


	}
}
