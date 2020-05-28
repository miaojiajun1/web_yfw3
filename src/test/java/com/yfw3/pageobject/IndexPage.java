package com.yfw3.pageobject;

import org.openqa.selenium.By;

import com.yfw3.base.BasePage;

public class IndexPage extends BasePage{

	//首页登录按钮元素	//a[text()='登录']
	private By loginBy = By.xpath("//a[text()='登录']");
	//首页购物车按钮元素	 //a[text()='购物车（']
	private By cartBy = By.xpath("//a[text()='购物车（']");
	//首页个人中心按钮	//a[text()='个人中心']
	private By personalCenterBy = By.xpath("//a[text()='个人中心']");
	//首页收藏夹按钮	//a[text()='收藏夹']
	private By favoriteBy = By.xpath("//a[text()='收藏夹']");
	//首页右上角商家入驻按钮	//ul[@id='TopNav']//a[text()='商家入驻']
	private By SettledBy = By.xpath("//ul[@id='TopNav']//a[text()='商家入驻']");
	//首页商家入驻	//img[@alt='商家入住']
//	private By SettledBy = By.xpath("//img[@alt='商家入住']");
	//首页免费注册按钮	//a[text()='免费注册']
	private By freeRegistrationBy = By.xpath("//a[text()='免费注册']");
	//首页搜索类型-商品	//a[text()='商品']
	private By productBy = By.xpath("//a[text()='商品']");
	//首页搜索类型-商家	//a[text()='商家']
	private By businessBy = By.xpath("//a[text()='商家']");
	//首页搜索类型-厂家	//a[text()='厂家']
	private By factoryBy = By.xpath("//a[text()='厂家']");
	//首页搜索类型-医院	//a[text()='医院']
	private By hospitalBy = By.xpath("//a[text()='医院']");
	//首页搜索输入框	//input[@id='keyword']
	private By inputBy = By.xpath("//input[@id='keyword']");
	//首页搜索按钮	//button[text()='搜索']
	private By searchBy = By.xpath("//button[text()='搜索']");
	
	//点击登录按钮
	public void clickLogin() {
		click(loginBy);
	}
	//点击商家入驻按钮
	public void clickSettle() {
		click(SettledBy);
	}
}
