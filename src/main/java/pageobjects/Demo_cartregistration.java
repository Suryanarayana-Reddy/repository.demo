package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.Keywords;

public class Demo_cartregistration {
WebDriver driver;
	
	//step 1 ://identify gender element in the webpage using id
	@FindBy(id="gender-male")
	@CacheLookup
	WebElement gender;

	//using how class
	//identify firstname element in the webpage using name
	@FindBy(how=How.NAME, using="FirstName")
	@CacheLookup
	WebElement firstname;
	//identify lastname element in the webpage using id
	@FindBy(how=How.ID, using="LastName")
	@CacheLookup
	WebElement lastname;
	//identify email element in the webpage using xpath
	@FindBy(how=How.XPATH, using="//*[@id='Email']")
	@CacheLookup
	WebElement email;
	//identify password element in the webpage using css
	@FindBy(how=How.CSS, using="input#Password")
	@CacheLookup
	WebElement password;
	//identify confirm password element in the webpage using xpath
	@FindBy(xpath="//*[@id='ConfirmPassword']")
	@CacheLookup
	WebElement confirmpass;
	//identify register element in the webpage using id
	@FindBy(id="register-button")
	@CacheLookup
	WebElement register;
	public void setGender() {
		Keywords.clickButton(gender);
	}
	public void setFirstname(String fname) {
		Keywords.sendData(this.firstname, fname);
	}

	public void setLastname(String lname) {
		Keywords.sendData(this.lastname, lname);
	}

	public void setEmail(String emailid) {
		Keywords.sendData(this.email, emailid);
	}

	public void setPassword(String passw) {
		Keywords.sendData(this.password,passw);
	}
	public void setConfirmpass(String confpass){
		Keywords.sendData(this.confirmpass, confpass);
	}
	public void setRegister() {
		Keywords.clickButton(register);
	}
	

	public WebElement getGender()  {
		return gender;
	}
	
	public WebElement getFirstname() {
		return firstname;
	}
	
	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	public WebElement getRegister() {
		return register;
	}
	public Demo_cartregistration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
