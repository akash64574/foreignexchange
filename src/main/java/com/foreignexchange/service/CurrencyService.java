package com.foreignexchange.service;

import com.foreignexchange.dto.CurrencyExrateDto;
import com.foreignexchange.exception.CurrencyNotFoundException;
import com.foreignexchange.exception.ExchangeRateNotFoundException;

public interface CurrencyService {

	public CurrencyExrateDto getExrateRateByCurrencyCode(String currencyCode)
			throws ExchangeRateNotFoundException, CurrencyNotFoundException;
}
