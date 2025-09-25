package pageObject;

import pages.BookAHotel;
import pages.BookingID;
import pages.LoginPage;
import pages.SearchHotel;
import pages.SelectHotel;
public class PageObjectManager {
	
    private LoginPage loginPage;
    private SearchHotel searchHotel;
    private SelectHotel selectHotel;
    private BookAHotel bookaHotel;
    private BookingID bookingId;
   
public LoginPage getLoginPage() {
	if(loginPage==null) {
		loginPage = new LoginPage();
	}
	return loginPage;
	
}
public SearchHotel getSearchHotel() {
	if(searchHotel==null) {
		searchHotel = new SearchHotel();
	}
	return searchHotel;
	
}
public SelectHotel getSelectHotel() {
	if(selectHotel==null) {
		selectHotel = new SelectHotel();
	}
	return selectHotel;
	
}
public BookAHotel getBookAHotel() {
	if(bookaHotel==null) {
		bookaHotel = new BookAHotel();
	}
	return bookaHotel;
	
}
public BookingID getBookingID() {
	if(bookingId==null) {
		bookingId = new BookingID();
	}
	return bookingId;
	
}

}
