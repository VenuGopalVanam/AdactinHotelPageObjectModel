package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class SearchHotel extends BaseClass {
	 // Constructor to initialize elements
	public SearchHotel() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Locators
	@FindBy(name = "location")
	private WebElement txtLocation;
	@FindBy(name = "hotels")
	private WebElement txtHotel;
	@FindBy(name = "room_type")
	private WebElement txtroomtype;
	@FindBy(name = "room_nos")
	private WebElement txtnoofrooms;
	@FindBy(name = "datepick_in")
	private WebElement checkIN;
	@FindBy(name = "datepick_out")
	private WebElement checkOUT;
	@FindBy(name = "adult_room")
	private WebElement txtadultperroom;
	@FindBy(name = "child_room")
	private WebElement txtchildperroom;
	@FindBy(name = "Submit")
	private WebElement txtsearch;
	
	//Actions
	public void Search(String location, String hotel, String roomType, String noOfRooms,
            String checkInDate, String checkOutDate,
            String adultsPerRoom, String childrenPerRoom) {
		//dropdowns do selectOptiontext
		WaitForElement(txtLocation, 10);
		SelectOptiontext(txtLocation, location);
		WaitForElement(txtHotel, 10);
		SelectOptiontext(txtHotel, hotel);
		WaitForElement(txtroomtype, 10);;
		SelectOptiontext(txtroomtype, roomType);
		WaitForElement(txtnoofrooms, 10);
		SelectOptiontext(txtnoofrooms, noOfRooms);
		//not Dropdowns textboxes without calender
		WaitForElement(checkIN, 10);
		checkIN.clear();
		sendkeys(checkIN, checkInDate);
		WaitForElement(checkOUT, 10);
		checkOUT.clear();
		sendkeys(checkOUT, checkOutDate);
		//dropdowns
		WaitForElement(txtadultperroom, 10);
		SelectOptiontext(txtadultperroom, adultsPerRoom);
		WaitForElement(txtchildperroom, 10);
		SelectOptiontext(txtchildperroom, childrenPerRoom);
		//button
		click(txtsearch);


	}
	

}
