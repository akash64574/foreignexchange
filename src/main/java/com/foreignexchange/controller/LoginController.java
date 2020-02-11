package com.foreignexchange.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foreignexchange.dto.LoginRequsetDto;
import com.foreignexchange.dto.LoginResponseDto;
import com.foreignexchange.exception.UserNotFoundException;
import com.foreignexchange.service.LoginService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping
@CrossOrigin
@Slf4j
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponseDto> authenticateUser(@Valid @RequestBody LoginRequsetDto loginRequestDto)
			throws UserNotFoundException {
		log.info("user login...");
		return ResponseEntity.ok().body(loginService.authenticateUser(loginRequestDto));
	}


}
