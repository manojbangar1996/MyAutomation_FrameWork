package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends BaseClass implements ITestListener
{
	ExtentReports extent=ExtentReportGenerator.getReports();
	
	ThreadLocal<ExtentTest> exenttest=new ThreadLocal<ExtentTest>();// using this multiple test case operation 

	public void onTestStart(ITestResult result)
	{
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		exenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) 
	{
		Library.test.log(Status.PASS, "Test Case Pass");
		Library.test.addScreenCaptureFromBase64String(getCapture());
	}

	public void onTestFailure(ITestResult result) 
	{
		Library.test.log(Status.FAIL, "Test Case Fail");
		Library.test.addScreenCaptureFromBase64String(getCapture());
	}

	public void onTestSkipped(ITestResult result)
	{
		Library.test.log(Status.SKIP, "Test Case Skip");
	}

	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
//Screen shot on Report
	public static String getCapture()
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	
}
