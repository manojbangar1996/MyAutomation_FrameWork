package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.Utility.BaseClass_Register;
import com.Utility.Library;
import com.pages.RegisterPom;

public class Register_Test extends BaseClass_Register
{
	@Test
	public void Register_User() 
	{
		
		RegisterPom reg=PageFactory.initElements(driver,RegisterPom.class);
		Library.custom_Sendkes(reg.getFirstname(),"Manoj");
		Library.custom_Sendkes(reg.getLastname(),"Bangar");
		Library.custom_Sendkes(reg.getPhone(),"123456789");
		Library.custom_Sendkes(reg.getEmail(),"manoj@gmail.com");
		Library.custom_Sendkes(reg.getAddress(),"Jawale Kadlag");
		Library.custom_Sendkes(reg.getCity(),"Sangamner");
		Library.custom_Sendkes(reg.getState(),"Maharashtra");
		Library.custom_Sendkes(reg.getPcode(),"422605");
		Library.Handle_DropDown(reg.getCountry(),"INDIA");
		Library.custom_Sendkes(reg.getUsername(),"manojbangar");
		Library.custom_Sendkes(reg.getPassword(),"123456");
		Library.custom_Sendkes(reg.getConfirm_password(),"123456");
		reg.getSubmit().click();
	}
}
