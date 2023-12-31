package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private String provider;
    private int referenceNumber;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
}
