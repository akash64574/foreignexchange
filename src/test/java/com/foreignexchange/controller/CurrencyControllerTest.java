package com.foreignexchange.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.foreignexchange.dto.CurrencyExrateDto;
import com.foreignexchange.exception.ExchangeRateNotFoundException;
import com.foreignexchange.service.CurrencyService;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyControllerTest {

	@InjectMocks
	CurrencyController currencyController;

	@Mock
	CurrencyService currencyService;

	CurrencyExrateDto currencyExrateDto = new CurrencyExrateDto();

	@Before
	public void init() {
		currencyExrateDto.setExrateRate(51.00);
		currencyExrateDto.setStatusCode(200);
	}

	@Test
	public void testGetExrateRateByCurrencyCode() throws ExchangeRateNotFoundException {
		//Given
		when(currencyService.getExrateRateByCurrencyCode("SGD")).thenReturn(currencyExrateDto);
		//When
		ResponseEntity<CurrencyExrateDto> response = currencyController.getExrateRateByCurrencyCode("SGD");
		//Then
		assertEquals(200, response.getBody().getStatusCode());
	}
}
