package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.Keywords;

public class Demo_cartlogin {
WebDriver driver;
	
	//step 1 : identify email element in the webpage using class name
	@FindBy(className="email")
	@CacheLookup
	WebElement mailid;

	//identify password element in the webpage using name
	@FindBy(how=How.NAME, using="Password")
	@CacheLookup
	WebElement password1;
	//identify login element in the webpage using xpath
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	@CacheLookup
	WebElement login;
	
	public void setMailid(String mail) {
	   Keywords.sendData(this.mailid,mail);
	}

	public void setPassword1(String passwo) {
		Keywords.sendData(this.password1,passwo);
	}
	public void setLogin() {
		Keywords.clickButton(login);
		}
	public WebElement getMailid() {
		return mailid;
	}

	public WebElement getPassword1() {
		return password1;
	}

	public WebElement getLogin() {
		return login;
	}
	public Demo_cartlogin (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
