package com.prm.prm_global_framework.test.services;

import java.io.IOException;
import java.util.List;

import com.prm.prm_global_framework.global_utilities.propertiesfile_utilities.services.PropertiesFileOperations;
import com.prm.prm_global_framework.global_utilities.propertiesfile_utilities.value_objects.ConfigurationFileVo;

public class TestDataRetrieval {

	public static void main(String[] args) throws IOException {

		try {

			PropertiesFileOperations configFile = new PropertiesFileOperations();

			String propertiesFilePath = "selenium_global_framework_resources/browser_config.properties";

			configFile.readPropertiesFile(propertiesFilePath);

			List<String> keyValue = configFile.retrieveAllKeyValuePairsFromPropertiesFile(propertiesFilePath);		
			List<String> onlyKeys = configFile.retrieveAllKeysFromPropertiesFile(propertiesFilePath);
			List<String> onlyValue = configFile.retrieveAllKeyValuesFromPropertiesFile(propertiesFilePath);

			System.out.println("\n"+"-----------------------------------------------" + "\n");

			for(String e: keyValue) {

				System.out.println (e);
			}

			System.out.println("\n"+"-----------------------------------------------" + "\n");

			System.out.println(onlyKeys);
			System.out.println("\n"+"-----------------------------------------------" + "\n");

			System.out.println(onlyValue);
			System.out.println("\n"+"-----------------------------------------------" + "\n");

			ConfigurationFileVo file = new ConfigurationFileVo();


			int chromeIndex = 0;
			int gekoIndex = 3;
			int ieIndex = 6;


			String chromeKey = file.getKey(keyValue, chromeIndex);
			String chromeValue = file.getValue(keyValue, chromeIndex);

			String gekoKey = file.getKey(keyValue, gekoIndex);
			String gekoValue = file.getValue(keyValue, gekoIndex);
			String ieKey = file.getKey(keyValue, ieIndex);
			String ieValue = file.getValue(keyValue, ieIndex);

			System.out.println(chromeKey);
			System.out.println("\n"+"-----------------------------------------------" + "\n");
			System.out.println(chromeValue);
			System.out.println("\n"+"-----------------------------------------------" + "\n");

			if(chromeKey.equals("browser.isChromeDriverEnable") && chromeValue.equals("Yes")) {

				System.out.println("Load Chrome Driver");

			}

			if(gekoKey.equals("browser.isGekoDriverEnable") && gekoValue.equals("Yes")) {

				System.out.println("Load firefox Driver");

			}

			if(ieKey.equals("browser.isInternetExplorerEnable") && ieValue.equals("Yes")) {

				System.out.println("Load IE Driver");

			}

		}
		catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("File not found");

		}

	}

}