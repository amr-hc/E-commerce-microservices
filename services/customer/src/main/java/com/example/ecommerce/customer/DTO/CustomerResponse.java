package com.example.ecommerce.customer.DTO;

import com.example.ecommerce.customer.model.Address;

public record CustomerResponse (
    String id,
    String firstname,
    String lastname,
    String email,
    Address address
){
}
