package com.rakuten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.status.Status;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;

	@PostMapping
	Integer saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		service.save(user);
		
		return user.getId();
	}

	@GetMapping
	List<User> getUsers() {
		return service.getUsers();
	}

	@GetMapping("name/{name}")
	List<User> getUsersByName(@PathVariable String name) {
		return service.getFilteredusersByName(name);
	}


	@GetMapping("age/{age}")
	List<User> getUsersByAge(@PathVariable int age) {
		return service.getFilteredusersByAge(age);
	}

}
