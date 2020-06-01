package com.yfw3.pageobject;

import org.openqa.selenium.By;

import com.yfw3.base.BasePage;

/**
 * 选择需要认证的资质类型
 */
public class TypeOfUploadPage extends BasePage{
	//管理员信息认证 -- 去认证
	private By administratorBy = By.xpath("//span[text()='管理员信息认证']/following-sibling::span/a[text()='去认证 >']");
	//营业执照认证
	private By businessLicenseBy = By.xpath("//span[text()='营业执照认证']/following-sibling::span/a[text()='去认证 >']");
	//法定代表人授权书认证
	private By authorizationBy = By.xpath("//span[text()='法定代表人授权书认证']/following-sibling::span/a[text()='去认证 >']");
	//药品经营许可证认证
	private By pharmaceuticalTradingBy = By.xpath("//span[text()='药品经营许可证认证']/following-sibling::span/a[text()='去认证 >']");
	//执业药师注册证认证
	private By licensedPharmacistBy = By.xpath("//span[text()='执业药师注册证认证']/following-sibling::span/a[text()='去认证 >']");
	
	//点击管理员信息认证后的去认证
	public void clickAdministrator() {
		click(administratorBy);
	}
	//点击营业执照认证
	public void clickBusinessLicense() {
		click(businessLicenseBy);
	}
	//点击法定代表人授权书
	public void clickAuthorization() {
		click(authorizationBy);
	}
	//点击药品经营许可证认证
	public void clickPharmaceuticalTrading() {
		click(pharmaceuticalTradingBy);
	}
	//点击执业药师注册证认证
	public void clickLicensedPharmacist() {
		click(licensedPharmacistBy);
	}
	
}
