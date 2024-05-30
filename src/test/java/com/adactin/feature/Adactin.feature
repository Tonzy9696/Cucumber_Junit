Feature: Book A Hotel in Adactin Application
Scenario: User Login the Adactin Application
Given User Launch The Adactin Application
When User Enter The Username in Username Field
And User Enter The Password in Password Field
Then User Click The Login Button And It Navigate To Next Page


Scenario: User Search Hotels In Adactin Application
When User Select The Hotel Location From Dropdown List Field
And User Select The Hotel From Dropdown List Field
And User Select The Room Type From The Dropdown List Field
And User Select The Number of Rooms from The Dropdown Field
And User Select The Adults Per Room From The Dropdown List Field
And User Select The Children Per Room From The Dropdown List Field
Then User Click On The Search Button

Scenario: User Confirms The Selected Hotel
When User Select The Hotel By Clicking the Radio Button
Then User Click on the Continue Button

Scenario: User Provide The User Details To Book The Hotel
When User Enters The First Name In The First Name Field
And User Enters The Last Name In The Last Name Field
And User Enters The Address In The Billing Address Field
And User Enters The Credit Card Number In The Credit Card Number Field
And User select The Credit Card Type From the Dropdown Field
And User Select The Expiry Date From The Select Month And Year In The Dropdown Field
And User Enters the CVV Number in the CVV Field
Then User Click On The Book Now Button And It Navigates to Booking Confirmation Page

Scenario: User Checks The Details Are Displayed Correctly
Then User Clicks My Itenary Button And It Navigates To Booked Itenary Page