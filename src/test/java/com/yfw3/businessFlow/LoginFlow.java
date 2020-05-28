package com.yfw3.businessFlow;

import com.yfw3.pageobject.LoginPage;

public class LoginFlow {
	private String username;
	private String password;
	
	//数据初始化
	//有参构造
	public LoginFlow(String username,String password) {
		this.username = username;
		this.password = password;
	}
	//无参构造
	public LoginFlow() {
		
	}
	
	//登录业务流程
	public void login() {
		LoginPage loginPage = new LoginPage();
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();
	}
	
	//点击首页登录按钮
	
}
