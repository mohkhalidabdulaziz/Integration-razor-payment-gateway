package com.paymentservice.paymentgateway.config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class ConfigBean {
    @Value("${razorpay.key}")
    private String key;
    @Value("${razorpay.secret}")
    private String secret;

    @Bean
    public RazorpayClient getRazorpayClient(){
        try {
            return new RazorpayClient(key, secret);
        } catch (RazorpayException e) {
            System.out.println("Unable to create client for razorpay");
            throw new RuntimeException("Failed to instantiate razorpay");
        }
    }
}
