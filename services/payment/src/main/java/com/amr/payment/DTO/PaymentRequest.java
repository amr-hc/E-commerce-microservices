package com.amr.payment.DTO;

import com.amr.payment.enums.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    Integer id,
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    Customer customer
) {
}
