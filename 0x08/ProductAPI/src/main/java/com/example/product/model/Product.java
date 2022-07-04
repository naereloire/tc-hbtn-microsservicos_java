package com.example.product.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private Long id;
    private String code;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime createdOne;
    private boolean status;
}
