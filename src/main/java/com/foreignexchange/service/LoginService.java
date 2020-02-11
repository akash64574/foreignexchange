package com.foreignexchange.service;

import javax.validation.Valid;

import com.foreignexchange.dto.LoginRequsetDto;
import com.foreignexchange.dto.LoginResponseDto;
import com.foreignexchange.exception.UserNotFoundException;

public interface LoginService {

	LoginResponseDto authenticateUser(@Valid LoginRequsetDto loginRequestDto) throws UserNotFoundException;

}
