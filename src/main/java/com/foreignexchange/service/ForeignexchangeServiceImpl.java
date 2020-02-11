package com.foreignexchange.service;

import java.util.List;

import com.foreignexchange.entity.Currency;
import com.foreignexchange.entity.UserAccount;

public interface ForeignexchangeServiceImpl {

	List<Currency> getAllCurrencies();

	UserAccount getAccountDetail(Long acctnum);

}
