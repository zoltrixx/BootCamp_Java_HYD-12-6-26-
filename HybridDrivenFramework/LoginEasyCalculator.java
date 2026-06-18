package com.Framework.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Framework.Page.BaseClass;
import com.Framework.Page.LoginPage;

import utility.ExcelDataReader;

public class LoginEasyCalculator extends BaseClass {
	@Test

	public void loginApp() throws Exception {
		ExcelDataReader excel = new ExcelDataReader();
		excel.getStringData("LoginEasyCalculation", 0, 0);

		LoginPage loginEasyCal = PageFactory.initElements(driver, LoginPage.class);
		loginEasyCal.Login_EasyCal(excel.getStringData("Sheet1", 0, 0),
				excel.getStringData("LoginEasyCalculation", 0, 1));
		Thread.sleep(10000);

	}

}
