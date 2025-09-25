package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class SelectHotel extends BaseClass {
	//  Constructor to initialize elements
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(name="radiobutton_0")
	private WebElement radiobutton;
	@FindBy(name="continue")
	private WebElement Continue;
	
	public void Hotelselect() {
		WaitForElement(radiobutton, 10);
		click(radiobutton);
		WaitForElement(Continue, 10);
		click(Continue);

	}
}
