package com.foreignexchange.exception;

/**
 * ExchangeRateNotFoundException - handle the user not found exception in this custom
 * exception class
 * 
 * @author Govindasamy.C
 * @version V1.1
 * @since 11-02-2020
 *
 */
public class ExchangeRateNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public ExchangeRateNotFoundException(String message) {
		super(message);
	}
}
