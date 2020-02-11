package com.foreignexchange.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDto {

	private Integer statusCode;
	private String message;
	private Integer userId;
	private String name;
	private Long accountNumber;

}
