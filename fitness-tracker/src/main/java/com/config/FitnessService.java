package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FitnessService {
	
	@Autowired AppointmentRepository appointmentRepository;
	@Autowired ContacttRepository contactRepository;
	
	public void save(Appointment appointment) {
		appointmentRepository.save(appointment);
	}

	public void deletById(int id) {
		appointmentRepository.deleteById(id);
	}

	public List<Appointment> getAppointmentsByEmail(String email) {
		List<Appointment> appointments = new ArrayList<>();
		appointments = appointmentRepository.findByEmail(email);
		appointmentRepository.find
		return appointments;
	}

	public void save(Contact contact) {
		contactRepository.save(contact);
	}

}
