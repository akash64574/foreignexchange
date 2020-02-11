package com.foreignexchange.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foreignexchange.common.ForeignExchangeEnum;
import com.foreignexchange.constant.AppConstant;
import com.foreignexchange.dto.LoginRequsetDto;
import com.foreignexchange.dto.LoginResponseDto;
import com.foreignexchange.entity.User;
import com.foreignexchange.entity.UserAccount;
import com.foreignexchange.exception.UserNotFoundException;
import com.foreignexchange.repository.UserAccountRepository;
import com.foreignexchange.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	UserAccountRepository userAccountrepository;

	@Override
	public LoginResponseDto authenticateUser(@Valid LoginRequsetDto loginRequestDto) throws UserNotFoundException {
		Optional<User> user = userRepository.findByPhoneNumberAndPassword(loginRequestDto.getPhoneNumber(),
				loginRequestDto.getPassword());

		LoginResponseDto loginResponseDto = new LoginResponseDto();

		if (user.isPresent()) {
			BeanUtils.copyProperties(user.get(), loginResponseDto);
			loginResponseDto.setName(user.get().getName());
			loginResponseDto.setUserId(user.get().getUserId());
			UserAccount accountDetails = userAccountrepository.findByUserIdAndAccountType(user.get(),
					ForeignExchangeEnum.AccountType.SAVINGS);
			loginResponseDto.setAccountNumber(accountDetails.getAccountNumber());
			loginResponseDto.setMessage(AppConstant.LOGIN_SCCUESS_MESSAGE);

			loginResponseDto.setStatusCode(AppConstant.SUCCESS_STATUS_CODE);

			log.info("UserServiceImpl authenticateUser ---> user signed in");
			return loginResponseDto;
		} else {
			log.error("UserServiceImpl authenticateUser ---> NotFoundException occured");
			throw new UserNotFoundException(AppConstant.USER_NOT_FOUND);
		}

	}

}
