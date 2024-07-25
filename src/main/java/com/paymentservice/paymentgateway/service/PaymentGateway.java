package com.paymentservice.paymentgateway.service;

import com.paymentservice.paymentgateway.dto.PaymentLinkRequestDto;
import com.paymentservice.paymentgateway.utils.PaymentStatus;
import org.springframework.stereotype.Component;

@Component
public interface PaymentGateway {
    String createPaymentLink(PaymentLinkRequestDto paymentLinkRequestDto);
    PaymentStatus getStatus(String paymentId, String orderId);
}
