package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.Keywords;

public class Demo_addtocart {
	WebDriver driver;
	//identify books element in the webpage using link text
	@FindBy(how=How.LINK_TEXT, using="Books")
	@CacheLookup
	WebElement bookslink;
	//identify book element in the webpage using partial link text
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Computing and")
	@CacheLookup
	WebElement computingbook;
	//identify addtocart element in the webpage using id
	@FindBy(how=How.ID, using="add-to-cart-button-13")
	@CacheLookup
	WebElement addtocart;
	
	public void setBookslink() {
		Keywords.clickButton(bookslink);
	}
	public void setComputingbook() {
		Keywords.clickButton(computingbook);
	}
	public void setAddtocart(){
		Keywords.clickButton(addtocart);
	}
	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getComputingbook() {
		return computingbook;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	public Demo_addtocart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
