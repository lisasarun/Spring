package com.lisa.webmvc.dto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.util.List;

public record ProductResponse (String name, BigDecimal price){

}
