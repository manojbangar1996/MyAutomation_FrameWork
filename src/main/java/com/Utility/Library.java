//Generic Methods

package com.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Library 
{
	//Generic Method Of SendKeys()
	
	public static void custom_Sendkes(WebElement element,String Value)
	{
		try
		{
			element.sendKeys(Value);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	//Generic Method Of Click
	
	public static void custom_Click(WebElement element)
	{
		try
		{
			element.click();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	//Generic Method Of Drop Down Handle
	
	public static void Handle_DropDown(WebElement element,String text)
	{
		try
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	//Generic Method of Scrolling Window
	
	public static void ScrollIntoElement(WebDriver driver,WebElement element)
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].SrollIntoView()",element);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	//Generic Method Of Handling Alert
	
	public static Alert HandleAlert(WebDriver driver)
	{
		return driver.switchTo().alert();
	}
	
	//Generic Method Of Mouse Movement
	
	public static void MovetoElement(WebDriver driver,WebElement element)
	{
		try
		{
			Actions act=new Actions(driver);
			act.moveToElement(element).click().build().perform();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Generic Method Of Right Click contextClick()
	
	 public static void Right_Clickonelement(WebDriver driver,WebElement element)
	 {
		 try
		 {
			 Actions act=new Actions(driver);
			 act.contextClick(element).build().perform();
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e.getMessage());
		}
	 }
	 
	//Generic Method Of Double  Click contextClick()
	 
	 public static void Double_ClickonElement(WebDriver driver,WebElement element)
	 {
		 try
		 {
			 Actions act=new Actions(driver);
			 act.doubleClick(element).build().perform(); 
		 }
		 catch (Exception e) {
			System.out.println(e.getMessage());
		}
	 }
	 
	 //Generic Method Of Get Element Text
	 
	 public static String gettext_Element(WebElement element)
	 {
		 return element.getText();
	 }
	 
	
}
