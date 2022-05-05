package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	List<User> users = new ArrayList<User>();
	
	@Autowired
	UserRepository repository;

	public List<User> getUsers() {
		return users;
	}

	void save(User user) {
		repository.save(user);
		users.add(user);
		//System.out.println("Save Method Called");
	}

	public List<User> getFilteredusersByName(String name) {
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name Cannot Be Empty!");
		}

		List<User> filteredUsers = new ArrayList<User>();
		for (User user : users) {
			if (user.getName().equals(name))
				filteredUsers.add(user);
		}
		return filteredUsers;
	}

	public List<User> getFilteredusersByAge(int age) {
		if (age <= 0) {
			throw new IllegalArgumentException("Age Cannot Be Negative!");
		}

		List<User> filteredUsers = new ArrayList<User>();
		for (User user : users) {
			if (user.getAge() == age)
				filteredUsers.add(user);
		}
		return filteredUsers;
	}

	public boolean deleteById(int id) {
		boolean exists = repository.existsById(id);
		if(!exists) return false;
		
		repository.deleteById(id);
		return true;
	}

	public boolean deleteAll() {
		Long size = repository.count();
		if(size == 0)return false;
		repository.deleteAll();
		return true;
	}
}