package com.prm.prm_global_framework.global_utilities.propertiesfile_utilities.services;

import java.util.ArrayList;
import java.util.List;
import com.prm.prm_global_framework.global_utilities.propertiesfile_utilities.data_access_object_concrete_class.retrieveDataFromPropertiesFile;

/* This class calls the methods for reading the framework config file
 * @author: Preeti M
 * @reviewed by: Abhishek K
 * @last updated: 10 Aug 2020
 * @last changes in: NA (e.g in calling read method)
 * */

public class PropertiesFileOperations {


	public void readPropertiesFile(String propertiesFileName) {

		retrieveDataFromPropertiesFile propertiesFile = new retrieveDataFromPropertiesFile();

		propertiesFile.readAndValidatePropertiesFile(propertiesFileName);

	}

	public List<String> retrieveAllKeyValuePairsFromPropertiesFile(String propertiesFilePath){

		retrieveDataFromPropertiesFile propertiesFile = new retrieveDataFromPropertiesFile();
		
		List<String> keyValuesPair = new ArrayList<String>();
		
		keyValuesPair = propertiesFile.getAllKeyValuePairsFromPropertiesFile(propertiesFilePath);

		return keyValuesPair;

	}

	public List<String> retrieveAllKeysFromPropertiesFile(String propertiesFilePath) {

		retrieveDataFromPropertiesFile propertiesFile = new retrieveDataFromPropertiesFile();

		List<String> keys = new ArrayList<String>();

		keys = propertiesFile.getAllKeysFromPropertiesFile(propertiesFilePath);

		return keys;

	}

	public List<String> retrieveAllKeyValuesFromPropertiesFile(String propertiesFilePath) {

		retrieveDataFromPropertiesFile propertiesFile = new retrieveDataFromPropertiesFile();

		List<String> values = new ArrayList<String>();
		
		values = propertiesFile.getAllKeyValuesFromPropertiesFile(propertiesFilePath);

		return values;

	}

	public String retrieveSingleKeyUsingIndex(List<String> keyValuePairList, int index) {
		
		retrieveDataFromPropertiesFile propertiesFile = new retrieveDataFromPropertiesFile();
		
		String singleKey = propertiesFile.getSingleKeyFromPropertiesFile(keyValuePairList, index);
		
		return singleKey;
	}

	public String retrieveSingleKeyValueUsingIndex(List<String> keyValuePairList, int index) {
		
		retrieveDataFromPropertiesFile propertiesFile = new retrieveDataFromPropertiesFile();
		
		String singleValue = propertiesFile.getSingleKeyValueFromPropertiesFile(keyValuePairList, index);
		
		return singleValue;
	}
	
}