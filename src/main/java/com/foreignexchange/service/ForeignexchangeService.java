package com.foreignexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foreignexchange.entity.Currency;
import com.foreignexchange.entity.UserAccount;
import com.foreignexchange.repository.CurrencyRepository;
import com.foreignexchange.repository.UserAccountRepository;
import com.foreignexchange.repository.UserRepository;

@Component
public class ForeignexchangeService implements  ForeignexchangeServiceImpl{

	@Autowired
	CurrencyRepository repo;
	
	@Autowired
	UserAccountRepository accountrepo;
	
	@Autowired
	UserRepository userrepo;
	
	public List<Currency> getAllCurrencies(){
		return repo.findAll();
		
	}
	
	

	@Override
	public UserAccount getAccountDetail(Long accountNumber) {
		 return accountrepo.findByAccountNumber(accountNumber);
	}
}
