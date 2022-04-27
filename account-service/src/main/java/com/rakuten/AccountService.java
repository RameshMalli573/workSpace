package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository repository;
	
	private List<Account> accounts = new ArrayList<Account>();

	public List<Account> getAccounts() {
		return accounts;
	}
	
	public void save(Account account) {
		repository.save(account);
		accounts.add(account);
	}

	public List<Account> getAccountById(int id) {
		List<Account> filteredAccounts = new ArrayList<Account>();
		for(Account account : accounts) {
			if(account.getAccount() == id) {
				System.out.println(account.getAccount());
				filteredAccounts.add(account); 
			}
		}
		return filteredAccounts;
	}
	
}
