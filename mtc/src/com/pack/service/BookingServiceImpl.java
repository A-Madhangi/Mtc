package com.pack.service;


import java.util.List;

import com.pack.dao.BookingDaoImpl;
import com.pack.model.BookingDetails;


public class BookingServiceImpl implements BookingService {

	
	public List<BookingDetails>checkBooking(BookingDetails a) {
		// TODO Auto-generated method stub
		 
		return new BookingDaoImpl().checkBooking(a);
	}
	
	
	
}
