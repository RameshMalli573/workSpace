package com.rakuten;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@DeleteMapping("/deleteAll")
	ResponseEntity<String> deleteAllRecords() {
		boolean isDeleted = service.deleteAll();
		
		if(!isDeleted) return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(null);
		else return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
	}
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<String> deleteById(@PathVariable int id) {
		boolean haveId = service.deleteById(id);
		
		if(!haveId) return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(null);
		else return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> validateInput(MethodArgumentNotValidException ex) {
		Map<String,String> errors = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach(error ->{
			String fieldName = ((FieldError) error).getField();
			String errorMessage = ((FieldError)error).getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}

}
