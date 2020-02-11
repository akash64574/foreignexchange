package com.foreignexchange.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserTransactionResponceDto {
	private Integer statusCode;
	private String message;
	
	private List<UserAccountDto> list;

}
