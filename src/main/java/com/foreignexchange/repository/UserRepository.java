package com.foreignexchange.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foreignexchange.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByPhoneNumberAndPassword(Long phoneNumber, String password);

}
