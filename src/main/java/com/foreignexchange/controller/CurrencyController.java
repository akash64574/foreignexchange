package com.foreignexchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foreignexchange.constant.AppConstant;
import com.foreignexchange.dto.CurrencyExrateDto;
import com.foreignexchange.exception.CurrencyNotFoundException;
import com.foreignexchange.exception.ExchangeRateNotFoundException;
import com.foreignexchange.service.CurrencyService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * Get the all currencies and get the exchange rate based on the currency code.
 * 
 * @author Govindasamy.C
 * @since 11-02-2020
 * @version V1.1
 * 
 *
 */
@RestController
@RequestMapping("currencies")
@CrossOrigin
@Slf4j
public class CurrencyController {

	@Autowired
	CurrencyService currencyService;

	/**
	 * Get the Exchange rate value based on the currencyCode
	 * 
	 * @param currencyCode - ID of the countryCode
	 * @return response of the exchange rate along with status code and message.
	 * @throws ExchangeRateNotFoundException - If throws this exception when no data
	 *                                       found for exchange rate from external
	 *                                       api call.
	 * @throws CurrencyNotFoundException
	 */
	@GetMapping("{currencyCode}")
	public ResponseEntity<CurrencyExrateDto> getExrateRateByCurrencyCode(@PathVariable String currencyCode)
			throws ExchangeRateNotFoundException, CurrencyNotFoundException {
		log.info("getting the exrate rate based on the currency code...");
		CurrencyExrateDto response = currencyService.getExrateRateByCurrencyCode(currencyCode);
		response.setStatusCode(HttpStatus.OK.value());
		response.setMessage(AppConstant.SUCCESS_MESSAGE);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
