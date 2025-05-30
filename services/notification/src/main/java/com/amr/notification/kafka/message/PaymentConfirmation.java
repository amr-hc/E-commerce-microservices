package com.amr.notification.kafka.message;

import com.amr.notification.enums.PaymentMethod;

import java.math.BigDecimal;

public record PaymentConfirmation(
    String orderReference,
    BigDecimal amount,
    PaymentMethod paymentMethod,
    String customerFirstname,
    String customerLastname,
    String customerEmail
) {
}
