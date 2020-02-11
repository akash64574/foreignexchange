package com.foreignexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foreignexchange.entity.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, String> {

}
