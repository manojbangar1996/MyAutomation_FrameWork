package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Register 
{
	public static WebDriver driver;
	public static ConfigDataProvider config;
	@BeforeSuite //Here we Create only Object of Class from utility package class name=ConfigDataProvider
	public void initialization() throws Exception//Initialization getdata from config data class
	{
		config=new ConfigDataProvider();//utility class object
	//	excel=new ExcelDataProvider();//utility class object
	}

	@Parameters("BrowserName")
	@BeforeMethod
	public void setUp(String BrowserName )
	{
		if(BrowserName.equalsIgnoreCase(config.getBrowserChrome()))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase(config.getBrowserEdge())) 
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get(config.getRegisterPage());
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
