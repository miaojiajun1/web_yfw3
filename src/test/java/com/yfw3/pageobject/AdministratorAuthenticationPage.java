package com.yfw3.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.yfw3.base.BasePage;

/**
 * 管理员信息认证
 * @author miao_
 *
 */
public class AdministratorAuthenticationPage extends BasePage{
	//身份证人像面
	private By idCardPortraitBy = By.xpath("//label[@data-imgtype='sfz_reverse']");
	//身份证国徽面
	private By idCardNationalEmblemBy = By.xpath("//label[@data-imgtype='sfz_front']");
	
	//管理员姓名
	private By administratorNameBy = By.xpath("//input[@id='admin_RealName']");
	//管理员身份证号
	private By administratorIdcardBy = By.xpath("//input[@id='admin_Idcard']");
	//提交按钮
	private By submitBy = By.xpath("//a[text()='提交']");
	//返回按钮
	private By backBy = By.xpath("//a[text()='<<返回']");
	
	
	//输入管理员姓名
	public void inputAdministratorName(String administratorName) {
		type(administratorNameBy, administratorName);
	}
	//输入管理员身份证号
	public void inputAdministratorIdcard(String administratorIdcard) {
		type(administratorIdcardBy, administratorIdcard);
	}
	//点击提交
	public void clickSubmit() {
		click(submitBy);
	}
	//点击返回
	public void clickBack() {
		click(backBy);
	}
	
	//上传身份证人像面 ---- 有问题
	public void inputImageBy(String image) {
		WebElement webElement = waitElementVisible(idCardPortraitBy);
		webElement.sendKeys(image);
	}
	
}
