
package com.prm.prm_global_framework.global_utilities.propertiesfile_utilities.data_access_object_interface;

import java.util.List;

public interface PropertiesFileDao {
		
	public void readAndValidatePropertiesFile(String propertiesFilePath);
	
	public List<String> getAllKeyValuePairsFromPropertiesFile(String propertiesFilePath);
	
	public List<String> getAllKeysFromPropertiesFile(String propertiesFilePath);
	
	public List<String> getAllKeyValuesFromPropertiesFile(String propertiesFilePath);
	
	public String getSingleKeyFromPropertiesFile(List<String> keyValuePairList, int index) ;
	
	public String getSingleKeyValueFromPropertiesFile(List<String> keyValuePairList, int index);
		

}
