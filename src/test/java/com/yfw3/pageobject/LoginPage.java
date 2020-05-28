package com.yfw3.pageobject;

import org.openqa.selenium.By;

import com.yfw3.base.BasePage;

public class LoginPage extends BasePage{
	
	//登录页面用户名输入框
	private By usernameBy = By.id("txt_AccountName");
	//登录页面密码输入框
	private By passwordBy = By.id("txt_Password");
	//登录页面登录按钮
	private By loginButtonBy = By.id("btn_Submit");
	
	//输入用户名
	public void inputUsername(String username) {
		type(usernameBy, username);
	}
	//输入密码
	public void inputPassword(String password) {
		type(passwordBy, password);
	}
	//点击登录按钮
	public void clickLoginButton() {
		click(loginButtonBy);
	}
}
