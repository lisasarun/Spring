package com.lisa.webmvc.dto;

import jakarta.validation.constraints.*;
import lombok.Builder;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;


public record CreateProductRequest (
        @NotBlank
        @Size(min=1,max=100)
        String name,

        @NotNull
        @PostMapping
        @Max(10000)
        BigDecimal price,

        @NotNull
        @Positive
        @Max(999999)
        Integer categoryId
){
}
