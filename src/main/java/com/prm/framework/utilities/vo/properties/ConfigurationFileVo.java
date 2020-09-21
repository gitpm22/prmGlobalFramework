package com.prm.framework.utilities.vo.properties;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import com.prm.framework.junk.TestConfigFile;

public class ConfigurationFileVo {

	public List<String> getConfigKeys(String propertiesFilePath) { 		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(TestConfigFile.class.getClassLoader().getResourceAsStream(propertiesFilePath)));		

		List<String> keyList = new ArrayList<String>();
		
		try {

			String[] split = new String [2];

			while(reader.ready()) {

				String line = reader.readLine();

				if(line != null) {
					
					split = line.split("=");
					keyList.add(split[0]);
				
				}

			}	

			reader.close();
			
		}
		catch(IOException e){
			
			System.out.println("File does not read");
		}
		

		return keyList;
		

	}

	public List<String> getConfigValues(String propertiesFilePath) {
	
		Properties propertiesFile = new Properties();
		
		InputStream loadedFile = TestConfigFile.class.getClassLoader().getResourceAsStream(propertiesFilePath);
			
		try {
			if (loadedFile != null) {

						propertiesFile.load(loadedFile);
				
				System.out.println("File Successfully Loaded");
			}

		}
		catch(Exception e) {

			System.out.println("Exception: " + e);

		}


		BufferedReader reader = new BufferedReader(new InputStreamReader(TestConfigFile.class.getClassLoader().getResourceAsStream(propertiesFilePath)));		

		
		List<String> valueList = new ArrayList<String>();
		
		try {

			String[] split = new String [2];

			while(reader.ready()) {

				String line = reader.readLine();

				if(line != null) {
					
					split = line.split("=");					
					valueList.add(propertiesFile.getProperty(split[0]));

				}
			}

			reader.close();
			
		}
		catch(IOException e){
			
			System.out.println("File does not read");
		}
		

		return valueList;

	}
	

	public List<String> getKeyValuePair(String propertiesFilePath){
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(TestConfigFile.class.getClassLoader().getResourceAsStream(propertiesFilePath)));		

		List<String> keyValuePair = new ArrayList<String>();
		String[] split = new String [2];
		String keyValue = null;

		try {
			while(reader.ready()) {

				String line = reader.readLine();

				if(line != null) {

					split = line.split("=");

					keyValue = Arrays.toString(split);
					keyValuePair.add(keyValue);

				}

			}			

			reader.close();
		}
		catch(IOException e) {

			System.out.println("Message: " + e);
		}		

		return keyValuePair;
	}


	public String getKey(List<String> list, int index){
		String keyValuepair = null;
		String[] keyWithSquareBracket = new String[2];
		String key = null;;
		
		try {

			keyValuepair = list.get(index);
			keyWithSquareBracket = keyValuepair.split(",");
			key = keyWithSquareBracket[0].replace("[", "");

		}
		catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("Index is out of boundry");
		}

		return key;
	}
	
	public String getValue(List<String> list, int index){
		String keyValuepair = null;
		String[] valueWithSquareBracket = new String[2];
		String temp = null;
		String value = null;
		
		try {

			keyValuepair = list.get(index);
			valueWithSquareBracket = keyValuepair.split(",");
			temp = valueWithSquareBracket[1].replace("]", "");
			value = temp.trim();

		}
		catch(ArrayIndexOutOfBoundsException e) {

			System.out.println("Index is out of boundry");
		}

		return value;
	}
	
	

}
