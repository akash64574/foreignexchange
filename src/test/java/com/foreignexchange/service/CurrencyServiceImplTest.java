package com.foreignexchange.service;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.foreignexchange.repository.CurrencyRepository;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyServiceImplTest {

	@InjectMocks
	CurrencyServiceImpl currencyServiceImpl;

	@Mock
	CurrencyRepository currencyRepository;
	
	@Before
	public void testGetExrateRateByCurrencyCode() {
		
	}
	
}
