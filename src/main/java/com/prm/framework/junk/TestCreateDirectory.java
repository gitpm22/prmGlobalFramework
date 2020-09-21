package com.prm.framework.junk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCreateDirectory {
	public static void main(String args[]) {

		try {
			
			String path = "/Users/jradmin/eclipse-workspace/prmGlobalFramework/src/main/resources/logs";

			//getting current date and time using calendar class
			DateFormat df = new SimpleDateFormat("ddMMyyyy");
			Calendar calobj = Calendar.getInstance();
			String date = df.format(calobj.getTime());
			//System.out.println(date);

			String name = "Log_".concat(date);
			System.out.println(name);

			String logPath = path+ "/"+name;
			System.out.println(logPath);

			File file = new File(logPath);
			//Creating the directory
			boolean bool = file.mkdir();
			
			if(bool){
				System.out.println("Directory created successfully");
			}else{
				System.out.println("Sorry couldn’t create specified directory");
			}
			
			
			// Create new log file with date time stamp
			
			//getting current date and time using calendar class
			DateFormat dateTimeStampFormat = new SimpleDateFormat("ddMMyyyy_HHmmss");
			Calendar calenderObject = Calendar.getInstance();
			String datedateTimeStamp = dateTimeStampFormat.format(calenderObject.getTime());
			//System.out.println(date);

			String logFileName = "Log_".concat(datedateTimeStamp)+".txt";
			System.out.println(logFileName);
			
			File logFile = new File(logPath+ "/" + logFileName );
			
		
			
			boolean logFileExists = logFile.createNewFile();
			
			if(logFileExists) {
				System.out.println("File is created successfully");
				
				FileWriter writer = new FileWriter(logFile, true);
	            BufferedWriter bufferedWriter = new BufferedWriter(writer);
	 
	            bufferedWriter.write("Hello World");
	            bufferedWriter.newLine();
	            bufferedWriter.write("See You Again!");
	 
	            bufferedWriter.close();
			}
			else
			{
				System.out.println("Sorry couldn’t create specified file");				
			}
			
		}
		catch(IOException e) {	
			System.out.println("File does not exists");
		}
		
		
	}
}
