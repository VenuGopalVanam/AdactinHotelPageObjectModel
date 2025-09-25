package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseclass.BaseClass;
public class BookAHotel extends BaseClass{
	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(name="first_name")
	private WebElement firstname;
	@FindBy(name="last_name")
	private WebElement lastname;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(name="cc_num")
	private WebElement ccNum;
	@FindBy(name="cc_type")
	private WebElement ccType;
	@FindBy(name="cc_exp_month")
	private WebElement ccexpmonth;
	@FindBy(name="cc_exp_year")
	private WebElement ccexpYear;
	@FindBy(name="cc_cvv")
	private WebElement CCV;
	@FindBy(name="book_now")
	private WebElement bookNow;
	
	//Actions
	public void Book(String first,String last, String addr, String ccnumber, String cctype, String ccexpmon,String ccexpyear,String cvv) {
		WaitForElement(firstname, 10);
		sendkeys(firstname, first);
		WaitForElement(lastname, 10);
		sendkeys(lastname, last);
		WaitForElement(address, 10);
		sendkeys(address, addr);
		WaitForElement(ccNum, 10);
		sendkeys(ccNum, ccnumber);
		WaitForElement(ccType, 10);
		SelectOptiontext(ccType, cctype);
		WaitForElement(ccexpmonth, 10);
		SelectOptiontext(ccexpmonth, ccexpmon);
		WaitForElement(ccexpYear, 10);
		SelectOptiontext(ccexpYear, ccexpyear);
		WaitForElement(CCV, 10);
		sendkeys(CCV, cvv);
		click(bookNow);

	}
	
}
