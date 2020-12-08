package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	static WebDriver driver;
	 public static WebDriver startBrowser() {
	        System.setProperty("webdriver.chrome.driver","C:\\Seleniumdrivers\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://demowebshop.tricentis.com/");
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        return driver;
}
	 public static void clickButton(WebElement we){
		 we.click();
	 }
	 public static void sendData(WebElement we,String data){
		 we.sendKeys(data);
	 }
	 public static WebDriver closeBrowser(){
		 driver.close();
		 return driver;
	 }
}
