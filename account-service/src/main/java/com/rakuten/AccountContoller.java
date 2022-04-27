package com.rakuten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountContoller {
	@Autowired
	AccountService service;
	
	
	@PostMapping
	public void saveUser(@RequestBody Account account) {
		System.out.println(account.getName());
		System.out.println(account.getAge());
		System.out.println(account.getMobileNumber());
		System.out.println(account.getType());
		System.out.println(account.getStatus());
		System.out.println(account.getCity());
		System.out.println(account.getState());
		
		service.save(account);
	}
	
	@GetMapping
	List<Account> getAccounts(){
		return service.getAccounts();
	}
	
}
