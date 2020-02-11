package com.foreignexchange.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountDetailResponse {

	private Integer statusCode;
	private String message;
	private Long accountNumber;
	private Double accountBalance;
	private String accountType;
	private String currencyType;

}
