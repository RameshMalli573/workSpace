package com.example.demo;


public class Appointment {
	enum TrainerPreference{
		MALE,FEMALE
	}
	private TrainerPreference trainerPreference;
	public Appointment(String prederredTrainer) {
		this.trainerPreference = TrainerPreference.valueOf(prederredTrainer);
	}
	

}
