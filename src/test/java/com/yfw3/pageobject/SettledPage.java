package com.yfw3.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.yfw3.base.BasePage;

public class SettledPage extends BasePage{
	//选择单体药店
	private By monomerChemistBy = By.xpath("//a[text()='我是单体药店']");
	//选择连锁药店
	private By chainChemistBy = By.xpath("//a[text()='我是连锁药店']");
	//选择批发企业
	private By wholesalerChemistBy = By.xpath("//a[text()='我是批发企业']");
	//点击开始按钮
	private By startBy = By.xpath("//a[text()='开始']");
	//输入用户名
	private By userNameBy = By.xpath("//input[@id='txtUserName']");
	//设置密码
	private By passwordBy = By.xpath("//input[@id='txtUserPass']");
	//确认密码
	private By password2By = By.xpath("//input[@id='txtUserPass2']");
	//企业名称
	private By companyNameBy = By.xpath("//input[@id='shop_title']");
	//管理员手机号
	private By administratorBy = By.xpath("//input[@id='txt_Mobile']");
	//短信验证码
	private By messageCodeBy = By.xpath("//input[@id='txtMobileCode']");
	//获取验证码按钮
	private By getMobileCodeBy = By.xpath("//a[text()='获取验证码']");
	//法定代表人或负责人
	private By legalPersonBy = By.xpath("//input[@id='legal_person']");
	//营业执照类型：多证合一 
	private By theMoreOneBy = By.xpath("//span[text()='多证合一']");
	//营业执照类型：非多证合一
	private By notTheMoreOneBy = By.xpath("//span[text()='非多证合一']");
	//社会信用 代码
	private By socialCreditCodeBy = By.xpath("//input[@id='social_code']");
	//获取省市选择框所在位置  
	private By selectProvincialBy = By.xpath("//select[@id='accountProvince']");
	//地级市定位
	private By selectPrefectureBy = By.xpath("//select[@id='accoutCity']");
	
	//店铺详细地址
	private By addressDetailBy = By.xpath("//input[@placeholder='请输入店铺详细地址']");
	//select省级下拉框
	public void selectProvincialByText(String text) {
		WebElement webElement = waitElementVisible(selectProvincialBy);
		Select select = new Select(webElement);
		select.selectByVisibleText(text);
	}
	//select地级市下拉框
	public void selectPrefectureByText(String text) {
		WebElement webElement = waitElementVisible(selectPrefectureBy);
		Select select = new Select(webElement);
		select.selectByVisibleText(text);
	}
	
	
	//合伙人代码
	private By partnerCodeBy = By.xpath("//input[@id='partner_code']");
	//注册按钮
	private By registerBy = By.xpath("//a[text()='注册']");
	//点击勾选同意协议
	private By agreeProtocolBy = By.xpath("//input[@type='checkbox']");
	
	
	
	
	//点击单体药店
	public void clickMonomerChemist() {
		click(monomerChemistBy);
	}
	//点击连锁药店
	public void clickChainChemist() {
		click(chainChemistBy);
	}
	//点击批发企业
	public void clickWholesalerChemistBy() {
		click(wholesalerChemistBy);
	}
	//点击开始按钮
	public void clickStart() {
		click(startBy);
	}
	//输入用户名
	public void inputUsername(String username) {
		type(userNameBy, username);
	}
	//设置密码
	public void inputPassword(String password) {
		type(passwordBy, password);
	}
	//确认密码
	public void inputConfirmPassword(String password2) {
		type(password2By, password2);
	}
	//企业名称
	public void inputCompanyName(String companyName) {
		type(companyNameBy, companyName);
	}
	//管理员手机号
	public void inputAdminMobile(String adminMobile) {
		type(administratorBy, adminMobile);
	}
	//短信验证码
	public void inputMessageCode(String messageCode) {
		type(messageCodeBy, messageCode);
	}
	//点击获取验证码
	public void clickGetMobileCode() {
		click(getMobileCodeBy);
	}
	//法定代表人或负责人
	public void inputLegalPerson(String legalPerson) {
		type(legalPersonBy, legalPerson);
	}
	//点击多证合一
	public void clickTheMoreOne() {
		click(theMoreOneBy);
	}
	//点击非多证合一
	public void clickNotTheMoreOne() {
		click(notTheMoreOneBy);
	}
	//社会信用代码
	public void inputSocialCreditCode(String socialCreditCode) {
		type(socialCreditCodeBy, socialCreditCode);
	}
	//店铺所在省级地
	public void clickProvincial() {
		click(selectProvincialBy);
	}
	//店铺所在地级市
	public void clickPrefecture() {
		click(selectPrefectureBy);
	}
	
	//店铺详细地址
	public void inputAddressDetail(String addressDetail) {
		type(addressDetailBy, addressDetail);
	}
	//合伙人代码
	public void inputPartnerCode(String partnerCode) {
		type(partnerCodeBy, partnerCode);
	}
	//点击注册
	public void clickRegister() {
		click(registerBy);
	}
	//同意协议
	public void clickAgreeProtocol() {
		click(agreeProtocolBy);
	}
	
}
