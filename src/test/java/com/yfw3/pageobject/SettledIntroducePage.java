package com.yfw3.pageobject;

import org.openqa.selenium.By;

import com.yfw3.base.BasePage;

/**
 * 商家入驻介绍页
 * @author miao_
 *
 */
public class SettledIntroducePage extends BasePage{
	//商家入驻按钮	//span[text()='商家入驻']
	private By settledIntroduceBy = By.xpath("//span[text()='商家入驻']");

	public void clickSettledIntroduce() {
		click(settledIntroduceBy);
	}

}
