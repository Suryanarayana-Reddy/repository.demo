package step_definition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.Keywords;
import org.junit.Assert;
import pageobjects.Demo_cartlogin;

public class Stepdef_login {
	 WebDriver driver;
	 Demo_cartlogin  objhbpg;
@Given("^User is on login page$")
public void user_is_on_login_page() throws Throwable {
	driver=Keywords.startBrowser();
	objhbpg = new Demo_cartlogin(driver);
	objhbpg = PageFactory.initElements(driver,Demo_cartlogin.class);
	 driver.findElement(By.linkText("Log in")).click();
}
@When("^User enters all valid data$")
public void user_enters_all_valid_data() throws Throwable {
	//Send the data which you want to enter in the email field
	objhbpg.setMailid("asdflkj@gmail.com");	
	  //For browser to wait 10 seconds we should give sleep 
	Thread.sleep(2500);
	//Send the data which you want to enter in the password field
	objhbpg.setPassword1("asdflkj");
	//For browser to wait 10 seconds we should give sleep 
	Thread.sleep(2500);
}
@When("^click on Log in$")
public void click_on_Log_in() throws Throwable {
	//To click on login button
   objhbpg.setLogin();
}
@Then("^login should be successful$")
public void login_should_be_successful() throws Throwable {
  String actual = driver.getTitle();
  Assert.assertEquals(actual,  "Demo Web Shop");
  System.out.println("login is successful");
  Thread.sleep(2500);
  driver=Keywords.closeBrowser();
}
@When("^I enter Email  as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
public void i_enter_Email_as_and_Password_as(String arg1, String arg2) throws Throwable {
	//To send data of multiple mail id's you want to enter
	objhbpg.setMailid(arg1);
	//For browser to wait 10 seconds we should give sleep 
	Thread.sleep(2500);
	//To send data of multiple passwords you want to enter
	objhbpg.setPassword1(arg2);	
	//For browser to wait 10 seconds we should give sleep 
	Thread.sleep(2500);
}
@Then("^login should be Unsuccessful$")
public void login_should_be_Unsuccessful() throws Throwable {
	String actual1 = driver.getTitle();
	Assert.assertNotEquals(actual1, "Demo web Shop");
  System.out.println("login is unsuccessfull"); 
  driver=Keywords.closeBrowser();
}

}
