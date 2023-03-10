package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPom 
{
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement Firstname;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	private WebElement lastname;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	private WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@name='address1']")
	private WebElement address;
	
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	private WebElement city;
	
	@FindBy(how=How.XPATH,using="//input[@name='state']")
	private WebElement state;
	
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")
	private WebElement pcode;
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	private WebElement country;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	private WebElement confirm_password;

	@FindBy(how=How.XPATH,using="//input[@name='submit']")
	private WebElement submit;
	
	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPcode() {
		return pcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirm_password() {
		return confirm_password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	

}
