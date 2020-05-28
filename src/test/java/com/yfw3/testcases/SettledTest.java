package com.yfw3.testcases;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.yfw3.pageobject.IndexPage;
import com.yfw3.pageobject.SettledIntroducePage;
import com.yfw3.pageobject.SettledPage;
import com.yfw3.testdatas.Constants;
import com.yfw3.utils.BrowserUtil;

public class SettledTest {
	public String usernameTimeStamp="";
	public String companyNameTimeStamp="";
	@Parameters({"browserName"})
	@BeforeSuite
	//前置步骤
		public void setUpSuite() {
			BrowserUtil.openBrowser("chrome");
			BrowserUtil.driver.get(Constants.INDEX_URL);
			BrowserUtil.browserMaxmize();
			startSettled();
		}
		
		/**
		 * 选择、输入数据
		 */
		public void startSettled() {
			//点击右上角入驻
			IndexPage indexPage = new IndexPage();
			indexPage.clickSettle();
			//介绍页点击商家入驻
			SettledIntroducePage settledIntroducePage = new SettledIntroducePage();
			settledIntroducePage.clickSettledIntroduce();
			SettledPage settledPage = new SettledPage();
			//点击单体药店,开始
			settledPage.clickMonomerChemist();
			settledPage.clickStart();
			//开始输入数据
			usernameTimeStamp = "mjj_"+System.currentTimeMillis();//用户名时间戳
			settledPage.inputUsername(usernameTimeStamp);
			settledPage.inputPassword("abc123");
			settledPage.inputConfirmPassword("abc123");
			companyNameTimeStamp = "上海药房网"+System.currentTimeMillis();//公司名时间戳
			settledPage.inputCompanyName(companyNameTimeStamp);
			settledPage.inputAdminMobile("13789998888");
			settledPage.inputMessageCode("123456");
//			settledPage.clickGetMobileCode();//点击获取验证码
			settledPage.inputLegalPerson("苗家俊");
			settledPage.clickTheMoreOne();
			settledPage.inputSocialCreditCode("9883838833");
			
			//店铺所在地
			settledPage.clickProvincial();
			settledPage.selectProvincialByText("上海市");
			settledPage.selectPrefectureByText("浦东新区");
			settledPage.inputAddressDetail("上海市浦东新区张江镇");
//			settledPage.inputPartnerCode("123456");
			settledPage.clickAgreeProtocol();
			settledPage.clickRegister();
		}

}
