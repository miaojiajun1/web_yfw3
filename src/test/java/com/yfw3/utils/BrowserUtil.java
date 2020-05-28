package com.yfw3.utils;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class BrowserUtil {
	
	public static WebDriver driver;//工具类不需要实例化
	/**
	 * 封装统一的去打开浏览器方法
	 * @param browserName 浏览器名字
	 * @return 对应的驱动
	 */
	public static void openBrowser(String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			ChromeDriver chromeDriver = new ChromeDriver();
			driver =  chromeDriver;
			
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.firefox.bin", "D:\\Firefox\\firefox.exe");
			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
			FirefoxDriver firefoxDriver = new FirefoxDriver();
			driver = firefoxDriver;
		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			InternetExplorerDriver ieDriver = new InternetExplorerDriver(capabilities);
			driver = ieDriver;
		}
	}
	public static void closeBrowser() {
		driver.quit();
	}
	
	//浏览器最大化
	public static void browserMaxmize() {
		driver.manage().window().maximize();
	}
}
