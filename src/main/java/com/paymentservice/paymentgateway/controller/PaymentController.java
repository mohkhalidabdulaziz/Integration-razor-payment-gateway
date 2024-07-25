package com.paymentservice.paymentgateway.controller;

import com.paymentservice.paymentgateway.service.PaymentService;
import com.paymentservice.paymentgateway.utils.PaymentStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    PaymentService paymentService;
    @Autowired
    PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    @PostMapping("/payment/createLink")
    String createPaymentLink(@RequestParam String orderId) {
        return paymentService.createLink(orderId);
    }

    @GetMapping("/payment/getPaymentStatus")
    public PaymentStatus getPaymentStatus(@RequestParam("paymentId") String paymentId, @RequestParam("orderId") String orderId){
        return paymentService.getPaymentStatus(paymentId, orderId);
    }
}
