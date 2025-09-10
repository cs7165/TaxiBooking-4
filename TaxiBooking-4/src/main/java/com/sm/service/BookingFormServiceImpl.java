package com.sm.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sm.model.BookingForm;
import com.sm.repository.BookingFormRepository;

@Service
public class BookingFormServiceImpl implements BookingFormService {
	
	private BookingFormRepository bookingFormRepository;
	
	
     @Autowired
	public void setBookingFormRepository(BookingFormRepository bookingFormRepository) {
		this.bookingFormRepository = bookingFormRepository;
	}
     
     @Autowired
     private ModelMapper modelMapper;

	@Override
	public BookingForm saveBookingForm(BookingForm bookingForm) {
		

		
		
		return bookingFormRepository.save(bookingForm);
	}

}
