package com.lisa.webmvc.dto;

import lombok.Builder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.util.List;

@Builder
public record ProductResponse (String name, BigDecimal price,Boolean status,String categoryName,String code){

}
