package com.sm.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.entity.ContactFormEntity;
import com.sm.model.ContactForm;
import com.sm.repository.ContactFormRepository;

@Service
public class ContactFormServiceImpl implements ContactFormService{
	
	@Autowired
	private ModelMapper modelMapper;
	
	private ContactFormRepository contactFormRepository;
	
    @Autowired
	public void setContactFormRepository(ContactFormRepository contactFormRepository) {
		this.contactFormRepository = contactFormRepository;
	}


	@Override
	public ContactFormEntity saveContactFormService(ContactForm contactForm) {
		
		ContactFormEntity entity = modelMapper.map(contactForm, ContactFormEntity.class);
		entity.setUcode(1000);
		
		
		
		return contactFormRepository.save(entity);
		
		
	}

}
