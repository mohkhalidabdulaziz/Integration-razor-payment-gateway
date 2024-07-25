package com.paymentservice.paymentgateway.repo;

import com.paymentservice.paymentgateway.model.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentDetails, Long> {

    Optional<PaymentDetails> findByOrderId(String orderId);


}
