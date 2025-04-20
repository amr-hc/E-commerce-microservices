package com.amr.order.kafka.message;

import com.amr.order.DTO.CustomerResponse;
import com.amr.order.DTO.PurchaseResponse;
import com.amr.order.enums.PaymentMethod;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
    String orderReference,
    BigDecimal totalAmount,
    PaymentMethod paymentMethod,
    CustomerResponse customer,
    List<PurchaseResponse> products
){
}
