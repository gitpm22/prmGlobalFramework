package com.prm.framework.utilities.vo;

import java.util.ArrayList;
import java.util.List;

public class AccessKeyValuesFromPropertiesFile {
	
	
	public List<String> getAllKeys(String propertiesFilePath){
		
		String[] splitFilePath = propertiesFilePath.split("/");
		List<String> configKeys = new ArrayList<String>();
		
		for(int i = 0; i< splitFilePath.length;i++)
		{
			if (splitFilePath[i].equals("framework_config.properties") || splitFilePath[i].equals("system_config.properties") || splitFilePath[i].equals("browser_config.properties") ) {
				
				ConfigurationFileVo configFile = new ConfigurationFileVo();
				
				configKeys = configFile.getConfigKeys(propertiesFilePath);
				
			}
			
		}		
	
	
	return configKeys;
	}
	
	public List<String> getAllKeyValues(String propertiesFilePath) {
		
		String[] splitFilePath = propertiesFilePath.split("/");
		
		List<String> configKeyValues = new ArrayList<String>();		
		for(int i = 0; i< splitFilePath.length;i++)
		{
			if (splitFilePath[i].equals("framework_config.properties") || splitFilePath[i].equals("system_config.properties") || splitFilePath[i].equals("browser_config.properties") ) {
			
				ConfigurationFileVo configFile = new ConfigurationFileVo();
				
				configKeyValues = configFile.getConfigValues(propertiesFilePath);
				
			}
		}

	return configKeyValues;
	}
	
public List<String> getAllKeysValuePairs(String propertiesFilePath){
		
		String[] splitFilePath = propertiesFilePath.split("/");
		List<String> configKeys = new ArrayList<String>();
		
		for(int i = 0; i< splitFilePath.length;i++)
		{
			if (splitFilePath[i].equals("framework_config.properties") || splitFilePath[i].equals("system_config.properties") || splitFilePath[i].equals("browser_config.properties") ) {
				
				ConfigurationFileVo configFile = new ConfigurationFileVo();
				
				configKeys = configFile.getKeyValuePair(propertiesFilePath);
				
			}
			
		}		
	
	
	return configKeys;
	}

public String getSingleKey(List<String> keyValuePairList, int index) {
	
	ConfigurationFileVo configFile = new ConfigurationFileVo();
	
	String key = configFile.getKey(keyValuePairList, index);
	
	return key;
}

public String getSingleValue(List<String> keyValuePairList, int index) {
	
	ConfigurationFileVo configFile = new ConfigurationFileVo();
	
	String value = configFile.getValue(keyValuePairList, index);
	
	return value;
}

}
