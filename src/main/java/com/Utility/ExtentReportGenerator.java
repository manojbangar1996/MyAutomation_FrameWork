package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator
{

	public static ExtentReports getReports()
	{
		String filepath="C:\\Testing WorkSpace2\\Automation_Framework\\Reports\\index.html";
		
		//ExtentSparkReporter class to set Title,Name,Theme
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(filepath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Automation FrameWork Report");
		reporter.config().setTheme(Theme.DARK);
		
		//ExtentReports to set Information
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Automation FrameWor Project");
		extent.setSystemInfo("Module Name","ABC");
		extent.setSystemInfo("Automation","Selenium WebDriver");
		extent.setSystemInfo("QA","PQR");
		return extent;
		
		
		
	}
}
