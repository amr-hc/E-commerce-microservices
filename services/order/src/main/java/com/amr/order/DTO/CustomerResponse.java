package com.amr.order.DTO;

public record CustomerResponse(
    String id,
    String firstname,
    String lastname,
    String email
) {
}
