package com.foreignexchange.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foreignexchange.common.ForeignExchangeEnum.TransferStatus;
import com.foreignexchange.entity.UserAccount;
import com.foreignexchange.entity.UserTransaction;

public interface UserTransactionRepository extends JpaRepository<UserTransaction, Integer>{

	List<UserTransaction> findAllByStatus(TransferStatus transferStatus);
	
	List<UserTransaction> findAllByFromUserAccount(UserAccount userAccount);

}
