package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class BookingID extends BaseClass {
	public BookingID() {
		PageFactory.initElements(driver, this);
	}
	
	//locators
	@FindBy(name="order_no")
	private WebElement orderID;
	
public String getOrdervalue() {
	WaitForElement(orderID, 10);
	return orderID.getAttribute("value");
	
	}
}
