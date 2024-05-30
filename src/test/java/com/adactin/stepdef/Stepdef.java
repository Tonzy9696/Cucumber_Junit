package com.adactin.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	
	public static WebDriver driver = Runner.driver;
	
	
	@Given("User Launch The Adactin Application")
	public void user_launch_the_adactin_application() {
		driver.get("https://adactinhotelapp.com/");
	}


	@When("User Enter The Username in Username Field")
	public void user_enter_the_username_in_username_field() {
		WebElement username = driver.findElement(By.xpath("//input[@class='login_input'][1]"));
		username.sendKeys("tonyfelir96");
	}
	
	
	@When("User Enter The Password in Password Field")
	public void user_enter_the_password_in_password_field() {
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Tonzylm@10");
	}
	
	
	@Then("User Click The Login Button And It Navigate To Next Page")
	public void user_click_the_login_button_and_it_navigate_to_next_page() {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
	}
	
	
	
	
	@When("User Select The Hotel Location From Dropdown List Field")
	public void user_select_the_hotel_location_from_dropdown_list_field() {
        WebElement Location  = driver.findElement(By.xpath("//select[@class='search_combobox']"));
		
		Select loc = new Select(Location);
		
		loc.selectByVisibleText("London");
	}



	@When("User Select The Hotel From Dropdown List Field")
	public void user_select_the_hotel_from_dropdown_list_field() {
        WebElement Hotel = driver.findElement((By.xpath("//select[@id='hotels']")));
		
		Select Hot = new Select(Hotel);
		
		Hot.selectByVisibleText("Hotel Sunshine");
	}
	
	
	@When("User Select The Room Type From The Dropdown List Field")
	public void user_select_the_room_type_from_the_dropdown_list_field() {
        WebElement Type = driver.findElement(By.xpath("//select[@id='room_type']"));
		
		Select Room = new Select(Type);
		
		Room.selectByVisibleText("Double");
	}
	
	
	@When("User Select The Number of Rooms from The Dropdown Field")
	public void user_select_the_number_of_rooms_from_the_dropdown_field() {
        WebElement NoRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		
		Select Nor = new Select(NoRooms);
		
		Nor.selectByIndex(2);
	}
	
	
	
	@When("User Select The Adults Per Room From The Dropdown List Field")
	public void user_select_the_adults_per_room_from_the_dropdown_list_field() {
        WebElement Persons = driver.findElement(By.xpath("//select[@name='adult_room']"));
		
		Select Per = new Select(Persons);
		
		Per.selectByIndex(2);
	}
	
	
	@When("User Select The Children Per Room From The Dropdown List Field")
	public void user_select_the_children_per_room_from_the_dropdown_list_field() {
        WebElement Child = driver.findElement(By.xpath("//select[@name='child_room']"));
		
		Select Chi = new Select(Child);
		
		Chi.selectByIndex(1);
	}
	
	
	@Then("User Click On The Search Button")
	public void user_click_on_the_search_button() {
		WebElement Search = driver.findElement(By.xpath("//input[@value='Search']"));
		Search.click();
	}
	
	
	
	
	
	@When("User Select The Hotel By Clicking the Radio Button")
	public void user_select_the_hotel_by_clicking_the_radio_button() {
		WebElement Sel = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		Sel.click();

	}


	@Then("User Click on the Continue Button")
	public void user_click_on_the_continue_button() {
		WebElement Continue = driver.findElement(By.xpath("//input[@name='continue']"));
		Continue.click();
	}
	
	
	
	
	
	@When("User Enters The First Name In The First Name Field")
	public void user_enters_the_first_name_in_the_first_name_field() {
		WebElement Fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		Fname.sendKeys("Tony");
	}



	@When("User Enters The Last Name In The Last Name Field")
	public void user_enters_the_last_name_in_the_last_name_field() {
		WebElement Lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		Lname.sendKeys("Felix");
	}
	
	
	@When("User Enters The Address In The Billing Address Field")
	public void user_enters_the_address_in_the_billing_address_field() {
		WebElement Baddress = driver.findElement(By.xpath("//textarea[@name='address']"));
		Baddress.sendKeys("D/1, Melbourne apartments");
	}
	
	
	@When("User Enters The Credit Card Number In The Credit Card Number Field")
	public void user_enters_the_credit_card_number_in_the_credit_card_number_field() {
		WebElement Card = driver.findElement(By.xpath("//input[@name='cc_num']"));
		Card.sendKeys("1234567890123456");
	}
	
	
	@When("User select The Credit Card Type From the Dropdown Field")
	public void user_select_the_credit_card_type_from_the_dropdown_field() {
		WebElement Cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
        Select cc = new Select(Cctype);
		
		cc.selectByVisibleText("VISA");
	}
	
	
	@When("User Select The Expiry Date From The Select Month And Year In The Dropdown Field")
	public void user_select_the_expiry_date_from_the_select_month_and_year_in_the_dropdown_field() {
        WebElement Month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		
		Select Mo = new Select(Month);
		
		Mo.selectByVisibleText("May");
		
        WebElement Year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		
		Select Ye = new Select(Year);
		
		Ye.selectByVisibleText("2028");
	}
	
	
	@When("User Enters the CVV Number in the CVV Field")
	public void user_enters_the_cvv_number_in_the_cvv_field() {
        WebElement Cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		
		Cvv.sendKeys("4747");

	    
	}
	
	
	@Then("User Click On The Book Now Button And It Navigates to Booking Confirmation Page")
	public void user_click_on_the_book_now_button_and_it_navigates_to_booking_confirmation_page() throws InterruptedException {
		WebElement Booknow = driver.findElement(By.xpath("//input[@value='Book Now']"));
		Booknow.click();
		
		Thread.sleep(8000);
	}
	
	
	@Then("User Clicks My Itenary Button And It Navigates To Booked Itenary Page")
	public void user_clicks_my_itenary_button_and_it_navigates_to_booked_itenary_page() throws InterruptedException {
		WebElement Ite = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		Ite.click();
		
		Thread.sleep(5000);
	}
	
	
	

	
	
	

}
