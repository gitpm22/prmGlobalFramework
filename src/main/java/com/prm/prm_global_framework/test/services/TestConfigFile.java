package com.prm.prm_global_framework.test.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class TestConfigFile {

	public static void main(String[] args) {

		Properties p = new Properties();

		String fileName = "selenium_global_framework_resources/framework_config.properties";

		InputStream file = TestConfigFile.class.getClassLoader().getResourceAsStream(fileName);

		try {

			if(file != null) {

				p.load(file);

			}


			String[] splitFilePath = fileName.split("/");

			String name = splitFilePath[1];

			System.out.println(name);

			BufferedReader reader = new BufferedReader(new InputStreamReader(TestConfigFile.class.getClassLoader().getResourceAsStream(fileName)));		

			//List<String> keyList = new ArrayList<String>();
			//List<String> valueList = new ArrayList<String>();
			List<String> keyValuePair = new ArrayList<String>();
			//List<String> myList = new ArrayList<String>();

			
			String[] split = new String [2];
			String keyValue = null;


			while(reader.ready()) {

				String line = reader.readLine();

				if(line != null) {
					
					
					
					split = line.split("=");
					
					keyValue = Arrays.toString(split);
					
					//myList = (Arrays.asList(line.split("=")));
	
					//add(Arrays.asList(split));
					
					
//					keyValue[0] = split[0];
//					
//					keyValue[1] = split[1];
//					
////					key = split[0];
////					value = p.getProperty(split[0]);		
////					
//					keyList.add(split[0]);
//					valueList.add(p.getProperty(split[0]));
////					
//					
					keyValuePair.add(keyValue);

				}

			}	
			
//			System.out.println(keyList);
//			System.out.println(valueList);
//			
//			
			
			
		      // System.out.println(myList);
		      
			//System.out.println();
					
		       
	        for(String e: keyValuePair) {
				System.out.println (e);
				}
//	        

	        int index = 2;
	       System.out.println(keyValuePair.get(index)); 
//	        
//	        boolean ans = keyValuePair.contains("framework.ExcelFileLocalPath");
//	        		//contains("framework.ExcelFileLocalPath"); 
//			  
//	        if (ans) 
//	            System.out.println("The list contains framework.ExcelFileLocalPath"); 
//	        else
//	            System.out.println("The list does not contains framework.ExcelFileLocalPath");
//	        
//	     
			reader.close();

			

		}
		catch(IOException e) {

			System.out.println("File not found");
		}
	}

}
