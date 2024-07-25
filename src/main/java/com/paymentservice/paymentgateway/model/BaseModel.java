package com.paymentservice.paymentgateway.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Generated;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

}
