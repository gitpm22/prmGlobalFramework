package com.prm.prm_global_framework.global_utilities.driver_utilities.data_access_object_interface;

import java.util.List;

public interface DriverDao {

	public List<String> getKeyValueList(String propertiesFilePath);
	
}
