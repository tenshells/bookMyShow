package models;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Booking extends BaseModel{
    private BookingStatus status;
    private Show show;
    private LocalDateTime time;
    private List<ShowSeat> seats;
    private List<ShowSeatType> seatTypes;
    private User user;
}
