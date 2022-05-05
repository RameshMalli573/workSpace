package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fitnesstracker")
public class FitnessController {
	
	@Autowired FitnessService service;

	@GetMapping("/contatcs")
	List<String> getAllContacts() {
		List<String> contacts = new ArrayList<>();

		return contacts;
	}

	@GetMapping("/appointments")
	List<Appointment> getAllAppointments() {
		List<Appointment> appointments = new ArrayList<>();
		appointments = service.getAllAppointments();
		return appointments;
	}

	@GetMapping("/appointments/{email}")
	List<Appointment> getAllAppointmentsOfUser(@PathVariable String email) {
		List<Appointment> appointments = new ArrayList<>();
		appointments = service.getAppointmentsByEmail(email);
		return appointments;
	}
	
	@PostMapping("/appointments")
	void createAppointment(@RequestBody Appointment appointment) {
		System.out.println("called");
		service.save(appointment);
	}
	
	@PutMapping("/appointments/{id}")
	void updateAppointment(@PathVariable int id,@RequestBody Appointment appointment) {
		service.updateAppointment(id,appointment);
	}

	@DeleteMapping("/appointments/{id}")
	void deleteAppointment(@PathVariable int id) {
		service.deletById(id);
	}
	
	@PostMapping("/contact-us")
	void createAppointment(@RequestBody Contact contact) {
		service.save(contact);
	}
	
}
