package com.crm.LoginTest;

import java.io.IOException;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.GenericLibrary.BaseClass;
import com.crm.ObjectRepository.LoginPage;

public class LoginPageTests extends BaseClass{
@Test
public void loginPageTests() throws IOException, Throwable {
	wlib.waitForPageLoad(driver);
	String username = elib.readDataFromExcel("TestData", 1, 0);
	String password = elib.readDataFromExcel("TestData", 1, 1);
	LoginPage loginpage=new LoginPage(driver);
	loginpage.usernametbx(username);
	loginpage.passwordtbx(password);
	loginpage.loginbtn();
	Reporter.log("signin success full",true);
}
}
