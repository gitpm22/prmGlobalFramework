package com.prm.framework.utilities.dao.impl.properties;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.prm.framework.utilities.dao.PropertiesFileDao;
import com.prm.framework.utilities.vo.properties.AccessKeyValuesFromPropertiesFile;


public class retrieveDataFromPropertiesFile implements PropertiesFileDao{


	public void readAndValidatePropertiesFile(String propertiesFilePath) {
							
		InputStream inputFile = retrieveDataFromPropertiesFile.class.getClassLoader().getResourceAsStream(propertiesFilePath);	

		
		try {
			if (inputFile != null) {

				System.out.println("'" + propertiesFilePath + "'" + " file found");
				
			}

		}
		catch(Exception e) {

			System.out.println("Exception: " + e);

		}

	}
	
	public List<String> getAllKeyValuePairsFromPropertiesFile(String propertiesFilePath) {

		AccessKeyValuesFromPropertiesFile keyValuePair = new AccessKeyValuesFromPropertiesFile();
		
		List<String> keyValuesList = new ArrayList<String>();

		keyValuesList = keyValuePair.getAllKeysValuePairs(propertiesFilePath);

		return keyValuesList;

	}

	public List<String> getAllKeysFromPropertiesFile(String propertiesFilePath) {

		AccessKeyValuesFromPropertiesFile keyValuePair = new AccessKeyValuesFromPropertiesFile();

		List<String> keysList = new ArrayList<String>();
		
		keysList = keyValuePair.getAllKeys(propertiesFilePath);

		return keysList;

	}

	public List<String> getAllKeyValuesFromPropertiesFile(String propertiesFilePath) {

		AccessKeyValuesFromPropertiesFile keyValuePair = new AccessKeyValuesFromPropertiesFile();
		
		List<String> valuesList = new ArrayList<String>();

		valuesList = keyValuePair.getAllKeyValues(propertiesFilePath);

		return valuesList;

	}
	
	public String getSingleKeyFromPropertiesFile(List<String> keyValuePairList, int index) {
		
		AccessKeyValuesFromPropertiesFile keyValuePair = new AccessKeyValuesFromPropertiesFile();
		
		String key = keyValuePair.getSingleKey(keyValuePairList, index);
		
		return key;
		
	}
	
	public String getSingleKeyValueFromPropertiesFile(List<String> keyValuePairList, int index) {
		
		AccessKeyValuesFromPropertiesFile keyValuePair = new AccessKeyValuesFromPropertiesFile();
		
		String value = keyValuePair.getSingleValue(keyValuePairList, index);
		
		return value;
		
	}

}




