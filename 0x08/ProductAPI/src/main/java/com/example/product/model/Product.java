package com.example.product.model;

import lombok.*;

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
    private String price;
    private LocalDateTime createdOne;
    private boolean status;
}
