package com.bookmyshow.bms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import com.bookmyshow.bms.model.ShowSeatStatus;

@Entity
@Data
@Table(name = "showseats")
public class ShowSeat extends Auditable{
    @ManyToOne
    private Booking booking;

    @ManyToOne
    private MovieShow show;

    @ManyToOne
    private AudiSeat audiSeat;

    private ShowSeatStatus status = ShowSeatStatus.AVAILABLE;

    private double price;

//    public ShowSeat(){}
}
