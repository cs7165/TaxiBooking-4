package com.sm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sm.model.BookingForm;

@Repository
public interface BookingFormRepository extends JpaRepository<BookingForm, Integer>{
	
	

	
	
}
