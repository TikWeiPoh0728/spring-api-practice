package com.codewithmosh.store.dtos;

import com.codewithmosh.store.entities.Category;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductDto {
    @JsonProperty("product_id")
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Long categoryId;
}
