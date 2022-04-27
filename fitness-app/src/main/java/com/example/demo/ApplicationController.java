package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get-started")
public class ApplicationController {
	@Autowired
	Service service;
	
	@PostMapping("/applicationForm")
	String applicationDetails(@RequestBody AppplicationDetails appplicationDetails) {
		System.out.println(appplicationDetails);
		return "Application Details Recieved Successfully";
	}
	
	@PostMapping("/contact-us")
	String messageDetails(@RequestBody Contact contact) {
		service.save(contact);
		return "We will reach out to you shortly";
	}
	
}
