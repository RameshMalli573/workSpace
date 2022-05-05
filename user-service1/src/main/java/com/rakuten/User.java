package com.rakuten;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@NotBlank
	String name;
	
	@Min(value = 1, message = "Age Cannot Be Negative")
	@Max(value = 110, message = "Max Age Allowed Is 110")
	int age;
	
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}