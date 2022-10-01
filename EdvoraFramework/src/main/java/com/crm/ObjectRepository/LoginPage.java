package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//div[@class='chakra-input__group css-b61uh7']/input[@autocomplete='username']")
	private WebElement usernameTbx;
	@FindBy(xpath="//div[@class='chakra-input__group css-b61uh7']/input[@autocomplete='current-password']")
	private WebElement passwordTbx;
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginbtn;
	@FindBy(xpath="//button[.='SignIn']")
	private WebElement signupbtn;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsernameTbx() {
		return usernameTbx;
	}
	public WebElement getPasswordTbx() {
		return passwordTbx;
	}
	
 public WebElement getLoginbtn() {
		return loginbtn;
	}
public WebElement getSignupbtn() {
		return signupbtn;
	}
public void usernametbx(String un) {
	 usernameTbx.sendKeys(un);
	 usernameTbx.click();
 }
 public void passwordtbx(String pwd) {
	 passwordTbx.sendKeys(pwd);
	 passwordTbx.click();
 }
 public void loginbtn() {
	 loginbtn.click();
 }
 public void signupbtn() {
	 signupbtn.click();
 }
 
}
