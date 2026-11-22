package com.codewithmosh.store.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class UpdateUserRequest {
    public String name;
    public String email;
}
