package com.yfw3.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.yfw3.base.BasePage;
/**
 * 选择药店类型、注册药店信息
 * @author miao_
 *
 */
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

	//合伙人代码
	private By partnerCodeBy = By.xpath("//input[@id='partner_code']");
	//点击勾选同意协议
	private By agreeProtocolBy = By.xpath("//input[@type='checkbox']");
	//注册按钮
	private By registerBy = By.xpath("//a[@class='submit js_register']");

	
	
	
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
	public void inputUsername(String data) {
		type(userNameBy, data);
	}
	//设置密码
	public void inputPassword(String data) {
		type(passwordBy, data);
	}
	//确认密码
	public void inputConfirmPassword(String data) {
		type(password2By, data);
	}
	//企业名称
	public void inputCompanyName(String data) {
		type(companyNameBy, data);
	}
	//管理员手机号
	public void inputAdminMobile(String data) {
		type(administratorBy, data);
	}
	//短信验证码
	public void inputMessageCode(String data) {
		type(messageCodeBy, data);
	}
	//点击获取验证码
	public void clickGetMobileCode() {
		click(getMobileCodeBy);
	}
	//法定代表人或负责人
	public void inputLegalPerson(String data) {
		type(legalPersonBy, data);
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
	public void inputSocialCreditCode(String data) {
		type(socialCreditCodeBy, data);
	}
	//店铺所在省级地
	public void clickProvincial() {
		click(selectProvincialBy);
	}
	//店铺所在地级市
	public void clickPrefecture() {
		click(selectPrefectureBy);
	}
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
	//店铺详细地址
	public void inputAddressDetail(String data) {
		type(addressDetailBy, data);
	}
	//合伙人代码
	public void inputPartnerCode(String data) {
		type(partnerCodeBy, data);
	}
	//同意协议 - 滑动到指定元素
	public void clickAgreeProtocol() {
		WebElement webElement = waitElementClickable(agreeProtocolBy);
//		JavascriptExecutor jsExecutor = 
		click(agreeProtocolBy);
	}
	//点击注册
	public void clickRegister() {
		click(registerBy);
	}
}
