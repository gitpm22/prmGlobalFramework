package com.prm.prm_global_framework.test.services;

import java.io.IOException;
import java.util.List;

import com.prm.prm_global_framework.global_utilities.driver_utilities.services.DriverOperations;
import com.prm.prm_global_framework.global_utilities.propertiesfile_utilities.services.PropertiesFileOperations;

public class TestDataRetrieval {

	public static void main(String[] args) throws IOException {

		try {

			PropertiesFileOperations configFile = new PropertiesFileOperations();

			String propertiesFilePath = "selenium_global_framework_resources/browser_config.properties";

			configFile.readPropertiesFile(propertiesFilePath);
			
			System.out.println("\n"+"-----------------------------------------------" + "\n");

			List<String> keyValue = configFile.retrieveAllKeyValuePairsFromPropertiesFile(propertiesFilePath);		
			List<String> onlyKeys = configFile.retrieveAllKeysFromPropertiesFile(propertiesFilePath);
			List<String> onlyValue = configFile.retrieveAllKeyValuesFromPropertiesFile(propertiesFilePath);

			for(String e: keyValue) {

				System.out.println (e);
			}

			System.out.println("\n"+"-----------------------------------------------" + "\n");

			System.out.println(onlyKeys);
			System.out.println("\n"+"-----------------------------------------------" + "\n");

			System.out.println(onlyValue);
			System.out.println("\n"+"-----------------------------------------------" + "\n");

			
			int chromeIndex = 0;
			int gekoIndex = 3;
			int ieIndex = 6;
			
			String chromeKey = configFile.retrieveSingleKeyUsingIndex(keyValue, chromeIndex);
			String chromeValue = configFile.retrieveSingleKeyValueUsingIndex(keyValue, chromeIndex);

			String gekoKey = configFile.retrieveSingleKeyUsingIndex(keyValue, gekoIndex);
			String gekoValue = configFile.retrieveSingleKeyValueUsingIndex(keyValue, gekoIndex);
			String ieKey = configFile.retrieveSingleKeyUsingIndex(keyValue, ieIndex);
			String ieValue = configFile.retrieveSingleKeyValueUsingIndex(keyValue, ieIndex);
			
			// Test Driver Operations
			
			DriverOperations chromeDriver = new DriverOperations();
			
			chromeDriver.loadChromeDriver(chromeKey, chromeValue);
			chromeDriver.loadGekoDriver(gekoKey, gekoValue);
			chromeDriver.loadIeDriver(ieKey, ieValue);

		}
		catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("File not found");

		}

	}

}