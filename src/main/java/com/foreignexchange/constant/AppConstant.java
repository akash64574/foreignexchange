package com.foreignexchange.constant;

/**
 * Set the all constant values and use that values in the whole application
 * 
 * @author Govindasamy.C
 * @since 11-02-2020
 * @version V1.1
 *
 */
public class AppConstant {

	private AppConstant() {

	}

	// Common
	public static final String FAILURE_MESSAGE = "FAILURE";
	public static final String SUCCESS_MESSAGE = "SUCCESS";
	public static final String NO_RECORDS_FOUND = "No Records Found";

	// User
	public static final String USER_NOT_FOUND = "User not found";
	public static final String USER_ACCOUNT_NOT_FOUND = "User Account not found";
	public static final String TO_USER_ACCOUNT_NOT_FOUND = "To user account not found";
	public static final Integer SUCCESS_STATUS_CODE = 200;
	public static final String LOGIN_SCCUESS_MESSAGE = "User Login Successfully";
	
	//Transfer the Currency converted
	public static final String TRANSFER_SCCUESS_MESSAGE = "Currency Exchanged Successfully";
	public static final String TRANSFER_AMOUNT_SHOULD_NOT_LESS_1 = "transferAmount can't be less than 1";
	public static final String REMIT_CHARGES_SHOULD_NOT_LESS_1 = "remitChanges can't be less than 1";
	public static final String TOTAL_AMOUNT_SHOULD_NOT_LESS_1 = "totalAmount can't be less than 1";
	

	public static final String EXRATE_RATE_URL = "https://api.exchangeratesapi.io/latest?base=";
	public static final String EXRATE_NOT_FOUND = "Exchange Rate not found";
	public static final String EXRATE_DECIMAL_FORMAT = "#.##";
	public static final String INR_CURRENCY_CODE = "INR";
	public static final String CURRENCY_NOT_FOUND = "Currency not found";
}
