package com.bookmyshow.bms.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "audiseats")
@Data
public class AudiSeat extends Auditable {
    private String rowNumber;
    private String seatNumber;
    @ManyToOne
    private Auditorium auditorium;

    @OneToMany(mappedBy = "audiSeat")
    private List<ShowSeat> showSeats = new ArrayList<>();

    @ManyToMany
    private List<SeatFeature> features = new ArrayList<>();

    public AudiSeat() {}

    public AudiSeat(String rowNumber, String seatNumber) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
    }
}
