package com.crm.LoginTest;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.crm.GenericLibrary.BaseClass;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.SignUpPage;


public class SignUpPageTest extends BaseClass {
	@Test
	public void signuppageTest() throws IOException, Throwable {
		wlib.waitForPageLoad(driver);
		String username = elib.readDataFromExcel("TestData", 1, 0);
		String password = elib.readDataFromExcel("TestData", 1, 1);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.signupbtn();
		SignUpPage signup=new SignUpPage(driver);
		signup.usernametbx(username);
		signup.passwordtbx(password);
		signup.createaccountbtn();
		Thread.sleep(2000);
		wlib.acceptAlert(driver);
		Reporter.log("sign up successful",true);
	}
	

}
