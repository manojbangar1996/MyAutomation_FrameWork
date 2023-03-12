//Send values thru generic method of sendkeys
package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Library;
import com.pages.LoginPom;

public class Login_Test2 extends BaseClass
{
	//Test Case Steps
		@Test
		public void verify_LoginPage()
		{
			//get Element from LoginPom Class from src/main/java
			//pass valu from generic method of sendkeys from library class
			
		LoginPom login=	PageFactory.initElements(driver,LoginPom.class); 
		
		Library.custom_Sendkes(login.getTxt_email(),excel.getStringData_Excel("Login", 0, 0));
		Library.custom_Sendkes(login.getTxt_password(),excel.getStringData_Excel("Login", 0, 1));
		Library.custom_Click(login.getBtn_login());
		
//		//1// Handle DropDown using generic method from library class
//		
//		Library.Handle_DropDown(null, null);
//		
//		//2// Scroll Element using generic method from library class
//		
//		Library.ScrollIntoElement(driver, null);
//		
//		//3// Alert Handling using generic method from library class
//		
//		Library.HandleAlert(driver).accept(); //press ok to alert message
//		
//		Library.HandleAlert(driver).dismiss();//press cancel to alert Message
//		
//		String text=Library.HandleAlert(driver).getText();//get Alert Message Text
//		
//		//4// Right Click On element using generic method from library class
//		
//		Library.Right_Clickonelement(driver, null);
//		
//		//5// Move to Element using generic method from library class
//		
//		Library.MovetoElement(driver, null);
//		
//		//6// Double Click On Element using generic method from library class
//		
//		Library.Double_ClickonElement(driver, null);
//		
//		// Get Text Of Element using generic method from library class
//		
//		String Element_Text=Library.gettext_Element(null);
//			
		}
		
}
