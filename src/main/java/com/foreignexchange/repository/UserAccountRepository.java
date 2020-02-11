package com.foreignexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foreignexchange.common.ForeignExchangeEnum.AccountType;
import com.foreignexchange.entity.User;
import com.foreignexchange.entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

	UserAccount findByUserIdAndAccountType(User user, AccountType accountType);

	UserAccount findByAccountNumber(long accountNumber);

}
