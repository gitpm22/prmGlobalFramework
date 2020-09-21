
package com.prm.framework.utilities.dao;

import java.util.List;

public interface PropertiesFileDao {
		
	public void readAndValidatePropertiesFile(String propertiesFilePath);
	
	public List<String> getAllKeyValuePairsFromPropertiesFile(String propertiesFilePath);
	
	public List<String> getAllKeysFromPropertiesFile(String propertiesFilePath);
	
	public List<String> getAllKeyValuesFromPropertiesFile(String propertiesFilePath);
	
	public String getSingleKeyFromPropertiesFile(List<String> keyValuePairList, int index) ;
	
	public String getSingleKeyValueFromPropertiesFile(List<String> keyValuePairList, int index);
		

}
