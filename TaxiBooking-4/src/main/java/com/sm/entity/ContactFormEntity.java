package com.sm.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;
@Entity
@Data
@Table(name="contactForm")
public class ContactFormEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private Long phone;

    private String message;
    
    private int ucode;

}
