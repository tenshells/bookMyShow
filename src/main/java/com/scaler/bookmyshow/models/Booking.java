package com.scaler.bookmyshow.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus status;

    @ManyToOne
    private Show show;
    
    private LocalDateTime time;
    
    @ManyToMany
    private List<ShowSeat> seats;
    @ManyToMany
    private List<ShowSeatType> seatTypes;

    @ManyToOne
    private User user;
    private int price;

    @ManyToOne
    private Screen screen;

    @OneToMany
    private List<Payment> payments;
}
