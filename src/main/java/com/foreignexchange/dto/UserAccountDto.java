package com.foreignexchange.dto;

import com.foreignexchange.common.ForeignExchangeEnum.AccountType;
import com.foreignexchange.common.ForeignExchangeEnum.TransferStatus;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserAccountDto {

	private Long toAccountNumber;
	private String currencyType;
	private String convertedType;
	private AccountType accountType;
	private Integer userTransactionId;
	private Double remitCharge;
	private Double totalAmount;
	private Double amount;
	private Double convertedAmount;
	private TransferStatus status;

}
