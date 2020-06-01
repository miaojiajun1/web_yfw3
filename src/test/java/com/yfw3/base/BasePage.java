package com.yfw3.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.yfw3.utils.BrowserUtil;

public class BasePage {
	public static WebDriver driver;
	/**
	 * 显示等待，等待元素是否可被点击
	 */
	public WebElement waitElementClickable(By by) {
		WebDriverWait webDriverWait = new WebDriverWait(BrowserUtil.driver, 15);
		WebElement webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
		return webElement;
	}
	/**
	 * 显示等待，等待元素是否可见
	 */
	public WebElement waitElementVisible(By by) {
		WebDriverWait webDriverWait = new WebDriverWait(BrowserUtil.driver, 15);
		WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return webElement;
	}
	
	public WebElement waiteElementSlide(By by) {
		WebDriverWait webDriverWait = new WebDriverWait(BrowserUtil.driver, 15);
		WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
		JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
		while(true){
			//滑动之前的页面信息
			String beforeSource = driver.getPageSource();
			//如果找到了元素，我们就退出
			if(beforeSource.contains("")){
				driver.findElement(By.xpath("//")).click();
				break;
			}		
			//滑动到指定元素的位置上
			jsExecuter.executeScript("arguments[0].scrollIntoView()",webElement);
//			Thread.sleep(1000);
			String afterSource = driver.getPageSource();
			//是不是滑动到了底部  getPageSource()
			if(beforeSource.equals(afterSource)){
				//滑动到了底部
				break;
				}
		}
		return webElement;
	}
	
	/**
	 * 点击
	 */
	public void click(By by) {
		waitElementClickable(by).click();
	}

	/**
	 * 输入字符串数据
	 */
	public void type(By by,String data){
		waitElementVisible(by).sendKeys(data);
	}

	/**
	 * 输入操作
	 */
	public void type(By by, Keys keys) {
		waitElementVisible(by).sendKeys(keys);
	}
	//获取到元素文本
	public String getElementText(By by) {
		String text = waitElementVisible(by).getText();
		return text;//return时代码已经结束，所以日志要写上面
	}
	//获取元素的某个属性值
	public String getElementAttributte(By by,String attributteName) {
		WebElement wehElement = waitElementVisible(by);
		String attributeValue = wehElement.getAttribute(attributteName);
		return wehElement.getAttribute(attributteName);
	}
	
}
