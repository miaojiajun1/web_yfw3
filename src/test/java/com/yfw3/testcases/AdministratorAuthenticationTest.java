package com.yfw3.testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.yfw3.pageobject.AdministratorAuthenticationPage;
import com.yfw3.pageobject.SettledIntroducePage;
import com.yfw3.pageobject.TypeOfUploadPage;
import com.yfw3.testdatas.Constants;
import com.yfw3.utils.BrowserUtil;

public class AdministratorAuthenticationTest {
	
	@Parameters({"browserName"})
	@BeforeSuite
	//前置步骤
		public void setUpSuite() throws InterruptedException{
			BrowserUtil.openBrowser("chrome");
			BrowserUtil.driver.get(Constants.INDEX_URL);
			BrowserUtil.browserMaxmize();
//			startSettled();
		}
	
	public void AdministratorAuthentication() {
		TypeOfUploadPage typeOfUploadPage = new TypeOfUploadPage();
		//点击管理员信息认证
		typeOfUploadPage.clickAdministrator();
		
		AdministratorAuthenticationPage adminAuthPage = new AdministratorAuthenticationPage();
		
	}
	

}
