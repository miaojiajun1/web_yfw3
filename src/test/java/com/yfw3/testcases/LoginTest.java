package com.yfw3.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.yfw3.businessFlow.LoginFlow;
import com.yfw3.pageobject.LoginPage;
import com.yfw3.testdatas.Constants;
import com.yfw3.testdatas.LoginDatas;
import com.yfw3.utils.BrowserUtil;

public class LoginTest extends LoginPage{
	
	@Parameters({"browserName"})
	@BeforeMethod
	public void setUp(String browserName) {
		//前置操作：打开浏览器、打开登录、最大化
		BrowserUtil.openBrowser(browserName);
		BrowserUtil.driver.get(Constants.LOGIN_URL);
		BrowserUtil.browserMaxmize();
	}
	
	@Test(description = "正确的用户名和正确的密码")
	public void login_sucess() throws InterruptedException {
		LoginFlow loginFlow = new LoginFlow(LoginDatas.CORRECT_USERNAME, LoginDatas.CORRECT_PASSWORD);
		loginFlow.login();
		
		//断言1：判断url是否为登录后的首页
		Thread.sleep(2000);
		String actualValue = BrowserUtil.driver.getCurrentUrl();
		String expectValue = Constants.INDEX_URL;
		Assert.assertEquals(actualValue, expectValue);
	}
	
	@AfterMethod
	public void tearDown(){
		//资源销毁:关闭浏览器
		BrowserUtil.closeBrowser();
	}
}
