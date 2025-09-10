package com.sm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.entity.ContactFormEntity;

@Repository
public interface ContactFormRepository extends JpaRepository<ContactFormEntity, Integer>{
	


}
