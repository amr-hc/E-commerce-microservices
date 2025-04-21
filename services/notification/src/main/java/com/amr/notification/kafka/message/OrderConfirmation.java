package com.amr.notification.kafka.message;

import com.amr.notification.DTO.Customer;
import com.amr.notification.DTO.Product;
import com.amr.notification.enums.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
    String orderReference,
    BigDecimal totalAmount,
    PaymentMethod paymentMethod,
    Customer customer,
    List<Product> products
) {
}
