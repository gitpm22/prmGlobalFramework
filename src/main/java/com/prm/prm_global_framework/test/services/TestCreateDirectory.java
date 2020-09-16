package com.prm.prm_global_framework.test.services;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCreateDirectory {
	public static void main(String args[]) {

		String path = "/Users/jradmin/eclipse-workspace/prmGlobalFramework/src/main/resources/execution_logs";

		//getting current date and time using calendar class
		DateFormat df = new SimpleDateFormat("ddMMyyyy_HH:mm:ss");
		Calendar calobj = Calendar.getInstance();
		String date = df.format(calobj.getTime());
		//System.out.println(date);

		String name = "Log_".concat(date);
		System.out.println(name);

		String logPath = path+name;
		File file = new File(logPath);
		//Creating the directory
		boolean bool = file.mkdir();
		if(bool){
			System.out.println("Directory created successfully");
		}else{
			System.out.println("Sorry couldn’t create specified directory");
		}
	}
}
