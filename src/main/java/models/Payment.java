package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel{
    private String provider;
    private int referenceNumber;
    private PaymentStatus paymentStatus;
    private int price;
    private PaymentMode paymentMode;
}
