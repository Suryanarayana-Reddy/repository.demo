package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.Keywords;
import org.junit.Assert;
import pageobjects.Demo_cartregistration;

public class StepDefDemoCart {
	public WebDriver driver;
	public Demo_cartregistration abcd;
		
@Given("^User is on registration page$")
public void user_is_on_registration_page() throws Throwable {
	driver=Keywords.startBrowser();
	abcd = new Demo_cartregistration(driver);
	abcd = PageFactory.initElements(driver,Demo_cartregistration.class);
     //To click on register link
		driver.findElement(By.linkText("Register")).click();
}

@When("^User enters all the valid data$")
public void user_enters_all_valid_data() throws Throwable {
	//To click on gender
	abcd.setGender();
	//To send data which you want to enter in the first name field
	abcd.setFirstname("surya");	Thread.sleep(2500);
	//To send data which you want to enter in the last name field
	abcd.setLastname("narayana");	Thread.sleep(2500);
	//To send data which you want to enter in the email field
	abcd.setEmail("surya22222@gmail.com");	Thread.sleep(2500);
	//To send data which you want to enter in the password field
	abcd.setPassword("Suryapulagam99@");	Thread.sleep(2500);
	//To send data which you want to enter in the confirm password field
	abcd.setConfirmpass("Suryapulagam99@");	Thread.sleep(2500);
	//To click on register
	abcd.setRegister();
}

@Then("^message displayed Register Successful$")
public void message_displayed_Register_Successful() throws Throwable {
	
   String expected = "Your registration completed";
   //To get the Text present in the message after successful registration
   String actual = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
   //To check whether the expected and actual message are same
   Assert.assertEquals(expected,actual);
   driver=Keywords.closeBrowser();
}

@When("^user leaves first Name blank$")
public void user_leaves_first_Name_blank() throws Throwable {
	//To click on gender
	abcd.setGender();
	//To send data which you want to enter in the first name field
	abcd.setFirstname("");	Thread.sleep(2500);
	//To send data which you want to enter in the last name field
	abcd.setLastname("narayana");	Thread.sleep(2500);
	//To send data which you want to enter in the Email field
	abcd.setEmail("surya@gmail.com");	Thread.sleep(2500);
	//To send data which you want to enter in the password field
	abcd.setPassword("Suryapulagam99@");	Thread.sleep(2500);
	//To send data which you want to enter in the confirm password field
	abcd.setConfirmpass("Suryapulagam99@");	Thread.sleep(2500);
	
}

@When("^clicks the register button$")
public void clicks_the_register_button() throws Throwable {
	//To click on register button
	abcd.setRegister();  
}

@Then("^display first name error message$")
public void display_first_name_error_message() throws Throwable {
	 //To get the Text present in the error message after entering blank firstname  
	String actual1 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/span[2]")).getText();
	String expected1 = "First name is required.";
	//To check whether the expected and actual message are same
    Assert.assertEquals(expected1,actual1);
    driver=Keywords.closeBrowser();
}

@When("^user leaves last Name blank and clicks the button$")
public void user_leaves_last_Name_blank_and_clicks_the_button() throws Throwable {
	//To click on gender
	abcd.setGender();
	//To send data which you want to enter in the first name field
	abcd.setFirstname("surya");	Thread.sleep(2500);
	//To send data which you want to enter in the last name field
	abcd.setLastname("");	Thread.sleep(2500);
	//To send data which you want to enter in the email field
	abcd.setEmail("surya@gmail.com");	Thread.sleep(2500);
	//To send data which you want to enter in the password field
	abcd.setPassword("Suryapulagam99@");	Thread.sleep(2500);
	//To send data which you want to enter in the confirm password field
	abcd.setConfirmpass("Suryapulagam99@");	Thread.sleep(2500);
	//To click on register button
	abcd.setRegister();
}

@Then("^display last name error message$")
public void display_last_name_error_message() throws Throwable {
	 //To get the Text present in the error message after entering blank lastname  
	String actual2 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/span[2]/span")).getText();
	String expected2 = "Last name is required.";
	 Assert.assertEquals(expected2,actual2);
	  driver=Keywords.closeBrowser();
}

@When("^user enters all data$")
public void user_enters_all_data() throws Throwable {
	abcd.setGender();
	//To send data which you want to enter in the first name field
	abcd.setFirstname("surya");	Thread.sleep(2500);
	//To send data which you want to enter in the last name field
	abcd.setLastname("narayana");	Thread.sleep(2500);
	//To send data which you want to enter in the email field
	abcd.setEmail("suryagmail.com");	Thread.sleep(2500);
	//To send data which you want to enter in the password field
	abcd.setPassword("Suryapulagam99@");	Thread.sleep(2500);
	//To send data which you want to enter in the confirm password field
	abcd.setConfirmpass("Suryapulagam99@");	Thread.sleep(2500);
	
}

@When("^user enters incorrect email format and clicks the button$")
public void user_enters_incorrect_email_format_and_clicks_the_button() throws Throwable {
	//To click on register button
	abcd.setRegister();
}

@Then("^display email error message$")
public void display_email_error_message() throws Throwable {
	 //To get the Text present in the error message after entering invalid Email  
	String actual3 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/span[2]/span")).getText();
	String expected3 = "Wrong email";
	//To check whether the expected and actual message are same
	 Assert.assertEquals(expected3,actual3);
	  driver=Keywords.closeBrowser();
}

@When("^user leaves password blank and clicks the button$")
public void user_leaves_password_blank_and_clicks_the_button() throws Throwable {
	abcd.setGender();
	//To send data which you want to enter in the first name field
	abcd.setFirstname("surya");	Thread.sleep(2500);
	//To send data which you want to enter in the last name field
	abcd.setLastname("narayana");	Thread.sleep(2500);
	//To send data which you want to enter in the email name field
	abcd.setEmail("surya@gmail.com");	Thread.sleep(2500);
	//To send data which you want to enter in the password field
	abcd.setPassword("");	Thread.sleep(2500);
	//To send data which you want to enter in the confirm password field
	abcd.setConfirmpass("Suryapulagam99@");	Thread.sleep(2500);
	//To click on register button
	abcd.setRegister();
}

@Then("^display password error message$")
public void display_password_error_message() throws Throwable {
	 //To get the Text present in the error message after entering blank firstname  
	String actual4 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/span[2]/span")).getText();
	String expected4 = "Password is required.";
	//To check whether the expected and actual message are same
	 Assert.assertEquals(expected4,actual4);
	  driver=Keywords.closeBrowser();
}

@When("^user leaves confirm password blank and clicks the button$")
public void user_leaves_confirm_password_blank_and_clicks_the_button() throws Throwable {
	abcd.setGender();
	//To send data which you want to enter in the first name field
	abcd.setFirstname("surya");	Thread.sleep(5000);
	//To send data which you want to enter in the last name field
	abcd.setLastname("narayana");	Thread.sleep(5000);
	//To send data which you want to enter in the email field
	abcd.setEmail("surya@gmail.com");	Thread.sleep(5000);
	//To send data which you want to enter in the password field
	abcd.setPassword("Suryapulagam99@");	Thread.sleep(5000);
	//To send data which you want to enter in the confirm password field
	abcd.setConfirmpass("");	Thread.sleep(5000);
	//To click on register button
	abcd.setRegister();
	
}

@Then("^display confirm password error message$")
public void display_confirm_password_error_message() throws Throwable {
	 //To get the Text present in the error message after entering blank firstname  
	String actual5 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/span[2]/span")).getText();
	String expected5 = "Password is required.";
	//To check whether the expected and actual message are same
	 Assert.assertEquals(expected5,actual5);
	  driver=Keywords.closeBrowser();
}
}