package com.lisa.webmvc.dto;

import java.math.BigDecimal;

public record CreateProductRequest (
        String name,
        BigDecimal price
){
}
