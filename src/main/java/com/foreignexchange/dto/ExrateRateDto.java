package com.foreignexchange.dto;

import java.time.LocalDate;
import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExrateRateDto {
    private HashMap<String, Double> rates; 
    private String base;
    private LocalDate date; 
}
