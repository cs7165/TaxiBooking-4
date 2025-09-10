package com.sm.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="bookingform")
public class BookingForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty(message = "name cant be empty")
	@NotBlank(message = "name cant be blank")
	@Size(min=2, max=30, message = "invalid name size")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "name only contains alphabet")
	@Column(length = 30, nullable = false)
	private String name;
	
	@NotEmpty(message = "source cant be empty")
	@NotBlank(message = "source cant be blank")
	@Size(min=2, max=100, message = "invalid source size")
	@Column(name = "from_location", length = 100, nullable = false)
	private String from;
	
	@NotEmpty(message = "email cant be empty")
	@NotBlank(message = "email cant be blank")
	@Size(min=5, max=50, message = "invalid email size")
	@Column(length = 50, nullable = false)
	private String email;
		
	@NotEmpty(message = "destination cant be empty")
	@NotBlank(message = "destination cant be blank")
	@Size(min=2, max=100, message = "invalid destination size")
	@Column(name = "to_location", length = 100, nullable = false)
	private String to;
	
	@NotNull(message = "time cant be null")
	@Column(nullable = false)
	private LocalTime time;
	
	@NotNull(message = "date cant be null")
	@Column(nullable = false)
	private LocalDate date;
	
	@NotEmpty(message = "comfort cant be empty")
	@Size(min=2, max=20, message = "invalid comfort size")
	@Column(length = 20, nullable = false)
	private String comfort;
	
	@Min(value=1, message = "adult must be at least 1")
	@Max(value=4, message = "adult can be at most 4")
	@Column(nullable = false)
	private int adult;
	
	@Max(value=3, message = "children can be at most 3")
	@Column(nullable = false)
	private int children;
	
	@NotEmpty(message = "message cant be empty")
	@NotBlank(message = "message cant be blank")
	@Size(min=2, max=2000, message = "invalid message size")
	@Column(length = 2000, nullable = false)
	private String message;

}
