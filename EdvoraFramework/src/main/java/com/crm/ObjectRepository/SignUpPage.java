package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	@FindBy(xpath="//div[@class='chakra-input__group css-b61uh7']/input[@autocomplete='username']")
	private WebElement usernameTbx;
	@FindBy(xpath="//div[@class='chakra-input__group css-b61uh7']/input[@autocomplete='current-password']")
	private WebElement passwordTbx;
@FindBy(xpath="//button[.='Create Account']")
private WebElement createaccountbtn;
@FindBy(xpath="//button[.='Login']")
private WebElement loginbtn;
public SignUpPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getUsernameTbx() {
	return usernameTbx;
}

public WebElement getPasswordTbx() {
	return passwordTbx;
}

public WebElement getCreateaccountbtn() {
	return createaccountbtn;
}


public WebElement getLoginbtn() {
	return loginbtn;
}
public void usernametbx(String un) {
	usernameTbx.sendKeys(un);
	usernameTbx.click();
}
public void passwordtbx(String pwd) {
	passwordTbx.sendKeys(pwd);
	passwordTbx.click();
}
public void createaccountbtn() {
	createaccountbtn.click();
}
public void loginbtn() {
	loginbtn.click();
}
}
