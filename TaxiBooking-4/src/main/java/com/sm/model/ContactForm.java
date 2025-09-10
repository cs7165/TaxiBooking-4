package com.sm.model;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ContactForm {
	
	
	private int id;
	
	@NotEmpty(message = "Name Cannot be Empty")
	@Size(min=2, max = 30, message = "Invalid Name Size")
	private String name;
	
	@NotEmpty(message = "Email Cannot be Empty")
	@Size(min=5, max = 50, message = "Invalid Email Size")
	private String email;
	
	@NotNull(message = "Number cannot be null")
	@Min(value= 1000000000,message = "Phone Number Must be at least 10 digits")
	@Max(value= 9999999999L,message = "Phone Number Must be at least 10 digits")
	private Long phone;
	
	@NotEmpty(message = "Message Cannot be Empty")
	@Size(min=5, max = 100, message = "Invalid Message Size")
	private String message;
	
	

}
