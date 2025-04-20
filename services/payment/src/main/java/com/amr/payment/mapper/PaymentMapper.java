package com.amr.payment.mapper;

import com.amr.payment.DTO.PaymentRequest;
import com.amr.payment.model.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {
    public Payment toPayment(PaymentRequest request) {
        if (request == null) {
            return null;
        }
        return Payment.builder()
                .id(request.id())
                .paymentMethod(request.paymentMethod())
                .amount(request.amount())
                .orderId(request.orderId())
                .build();
    }
}
