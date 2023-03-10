package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;
	public ConfigDataProvider() throws Exception//Constructor
	
	{
		//Here We Get File Path of config.properties to read data stored  in that file
		
		String filepath="C:\\Testing WorkSpace2\\Automation_Framework\\config\\config.properties";
		FileInputStream fis=new FileInputStream(filepath);
		
		pro=new Properties();
		pro.load(fis);
	}
	public String getBaseurl()//Method created to get data from Config.property 
	{
		return pro.getProperty("BaseUrl");//BaseUrl is key from configdata file
	}
	
	public String getBrowserChrome()//Method created to get data from Config.property 
	{
		return pro.getProperty("BrowserChrome");
	}
	
	public String getBrowserEdge()//Method created to get data from Config.property 
	{
		return pro.getProperty("BrowserEdge");
	}
	
	public String getExcelPath()
	{
		return pro.getProperty("ExcelPath");
	}
	
	public String getRegisterPage()
	{
		return pro.getProperty("RegisterPage");
	}
}
