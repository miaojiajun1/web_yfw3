package com.yfw3.pageobject;

import org.openqa.selenium.By;

import com.yfw3.base.BasePage;

/**
 * 登录页
 * @author miao_
 *
 */
public class LoginPage extends BasePage{
	//登录页面用户名输入框
	private By usernameBy = By.id("txt_AccountName");
	//登录页面密码输入框
	private By passwordBy = By.id("txt_Password");
	//登录页面登录按钮
	private By loginButtonBy = By.id("btn_Submit");
	
	//输入用户名
	public void inputUsername(String data) {
		type(usernameBy, data);
	}
	//输入密码
	public void inputPassword(String data) {
		type(passwordBy, data);
	}
	//点击登录按钮
	public void clickLoginButton() {
		click(loginButtonBy);
	}
}
