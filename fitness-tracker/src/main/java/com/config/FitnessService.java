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
		return appointments;
	}

	public void save(Contact contact) {
		contactRepository.save(contact);
	}

	public List<Appointment> getAllAppointments() {
		return appointmentRepository.findAll();
	}

	public void updateAppointment(int id, Appointment appointment) {
		if(!appointmentRepository.existsById(id)) {
			return;
		}
		Appointment fetchedAppointment = appointmentRepository.getById(id);
		appointmentRepository.deleteById(id);
		if(appointment.getAddressLine1() != null) {
			fetchedAppointment.setAddressLine1(appointment.getAddressLine1());  
		}
		if(appointment.getAddressLine2() != null) {
			fetchedAppointment.setAddressLine2(appointment.getAddressLine2());  
		}
		if(appointment.getAge() != 0) {
			fetchedAppointment.setAge(appointment.getAge());  
		}
		
		if(appointment.getName() != null) {
			fetchedAppointment.setName(appointment.getName());  
		}
		if(appointment.getMobileNumber() != null) {
			fetchedAppointment.setMobileNumber(appointment.getMobileNumber());
		}
		appointmentRepository.save(fetchedAppointment);
	}

}
