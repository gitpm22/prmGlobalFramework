package com.prm.prm_global_framework.global_utilities.driver_utilities.services;

public class DriverOperations {

	public void loadChromeDriver(String chromeDriverKey, String chromeDriverValue) {


		try {
			if(chromeDriverKey.equals("browser.isChromeDriverEnable") && chromeDriverValue.equals("Yes")) {

				System.out.println("Chrome Driver loaded successfully");
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
