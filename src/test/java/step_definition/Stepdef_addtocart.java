package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.Keywords;

import org.junit.Assert;
import pageobjects.Demo_addtocart;
public class Stepdef_addtocart {
	 WebDriver driver;
	 Demo_addtocart objhbpg; 
@Given("^User is on home page$")
public void user_is_on_home_page() throws Throwable {
	driver=Keywords.startBrowser();
	objhbpg = new Demo_addtocart(driver);
	objhbpg = PageFactory.initElements(driver,Demo_addtocart.class);
	 driver.findElement(By.linkText("Log in")).click();
}
@When("^User clicks on log in enters into login page$")
public void user_clicks_on_log_in_enters_into_login_page() throws Throwable {
	//To click on the login link
  driver.findElement(By.linkText("Log in")).click();
}
@When("^User enters Email and Password$")
public void user_enters_Email_and_Password() throws Throwable {
	//Send the data which you want to enter in the email field
  driver.findElement(By.className("email")).sendKeys("asdflkj@gmail.com");
  //For browser to wait 10 seconds we should give sleep 
  Thread.sleep(2500);
//Send the data which you want to enter in the password field
  driver.findElement(By.name("Password")).sendKeys("asdflkj");
//For browser to wait 10 seconds we should give sleep 
  Thread.sleep(2500);
}

@Then("^User logins successfully$")
public void user_logins_successfully() throws Throwable {
	//To click on login button
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
    System.out.println("User logged in successfully");
}
@When("^User clicks on books link$")
public void user_clicks_on_books_link() throws Throwable {
	//To click on the books link
   objhbpg.setBookslink();
}

@When("^selects a book to add to cart$")
public void selects_a_book_to_add_to_cart() throws Throwable {
	//To click on the book you want to see
   objhbpg.setComputingbook();
}

@When("^click on Add to cart$")
public void click_on_Add_to_cart() throws Throwable {
	//To click on the add to cart link
    objhbpg.setAddtocart();
}

@Then("^item is added to cart successfully$")
public void item_is_added_to_cart_successfully() throws Throwable {
	//To get the text present in the success message
String act = driver.findElement(By.xpath("//*[@id='bar-notification']/p")).getText();
   //To print the text
	System.out.println(act);
String exp = "The product has been added to your shopping cart";
   //To check whether the expected and actual message are equal
Assert.assertEquals(exp, act);
}
}
