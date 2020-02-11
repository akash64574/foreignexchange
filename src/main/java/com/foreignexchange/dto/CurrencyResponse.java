package com.foreignexchange.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CurrencyResponse {

	private Integer statuscode;
	private String message;
	private List<CurrencyResObj> currencies;

}
