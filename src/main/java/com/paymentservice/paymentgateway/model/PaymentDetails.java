package com.paymentservice.paymentgateway.model;

import com.paymentservice.paymentgateway.utils.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PaymentDetails {
    private String orderId;
    private String paymentId;
    private String PaymentLink;
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
}
