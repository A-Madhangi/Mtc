package com.pack.model;

public class BookingDetails {
private String from_place;
public BookingDetails(String from_place, String to_place, int no_of_persons) {
	super();
	this.from_place = from_place;
	this.to_place = to_place;
	this.no_of_persons = no_of_persons;
}
public BookingDetails()
{
	
}
private String to_place;
private int bus_fee;
private int no_of_persons;

public int getNo_of_persons()
{
	return no_of_persons;
}

public void setNo_of_persons(int no_of_persons)
{
	this.no_of_persons= no_of_persons;
}



public String getFrom_place() {
	return from_place;
}
public void setFrom_place(String from_place) {
	this.from_place = from_place;
}
public BookingDetails(String from_place, String to_place, int bus_fee, int food_fee, int stay_fee) {
	super();
	this.from_place = from_place;
	this.to_place = to_place;
	this.bus_fee = bus_fee;
	this.food_fee = food_fee;
	this.stay_fee = stay_fee;
}
public String getTo_place() {
	return to_place;
}
public void setTo_place(String to_place) {
	this.to_place = to_place;
}
public int getBus_fee() {
	return bus_fee;
}
public void setBus_fee(int bus_fee) {
	this.bus_fee = bus_fee;
}
public int getFood_fee() {
	return food_fee;
}
public void setFood_fee(int food_fee) {
	this.food_fee = food_fee;
}
public int getStay_fee() {
	return stay_fee;
}
public void setStay_fee(int stay_fee) {
	this.stay_fee = stay_fee;
}
private int food_fee;
private int stay_fee;
}
