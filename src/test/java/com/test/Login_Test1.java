package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.Utility.BaseClass;
import com.pages.LoginPom;

public class Login_Test1 extends BaseClass //inherits browser open class 
{
//Test Case Steps
	@Test
	public void verify_LoginPage()
	{
		//get Element from LoginPom Class from src/main/java
		
	LoginPom login=	PageFactory.initElements(driver,LoginPom.class);
	login.getTxt_email().sendKeys(excel.getStringData_Excel("Login", 0, 0));
	login.getTxt_password().sendKeys(excel.getStringData_Excel("Login", 0, 1));
	login.getBtn_login().click();
		
	}
	
}
