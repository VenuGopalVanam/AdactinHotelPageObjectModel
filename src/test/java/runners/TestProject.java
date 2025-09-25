package runners;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pageObject.PageObjectManager;

public class TestProject extends BaseClass {
	PageObjectManager pm = new PageObjectManager();
	
	@BeforeClass
	private void Initialization() {
		getBrowser("chrome");
		getUrl("https://adactinhotelapp.com/");

	}
	@Test
	private void Functionality() {
		pm.getLoginPage().login("venugopalV12", "E8579C");
		String actualtitle = driver.getTitle();
		String expectedtitle ="Adactin.com - Search Hotel";
		Assert.assertEquals(actualtitle, expectedtitle,"Login failed: Page title mismatch!");
		pm.getSearchHotel().Search( "Sydney",       // location
		                            "Hotel Creek",  // hotel
		                            "Standard",     // room type
		                            "1 - One",      // no of rooms
		                            "26/09/2025",   // check in date
		                            "30/09/2025",   // check out date
		                            "2 - Two",      // adults per room
		                            "0 - None");      // children per room
		    
		pm.getSelectHotel().Hotelselect();
		pm.getBookAHotel().Book("Venu",              //firstname
				                "Gopal",             //lastname
				                "Hyderabad",         //address
				                "1111222233334444",  //ccnumber
				                "VISA",              //cctype
				                "May",               //ccexpmonth
				                "2027",              //ccexpyear
				                "567");              //cvv
		String orderId =pm.getBookingID().getOrdervalue();
		System.out.println("ORDERID ID:"+orderId);
		quitBrowser();
	}

}
