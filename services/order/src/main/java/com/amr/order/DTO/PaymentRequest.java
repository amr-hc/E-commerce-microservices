package com.amr.order.DTO;

import com.amr.order.enums.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
     BigDecimal amount,
     PaymentMethod paymentMethod,
     Integer orderId,
     String orderReference,
     CustomerResponse customer
) {
}
