package testBrowserSetup;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossbrowser{
	
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","F:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver","F:\\automation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
