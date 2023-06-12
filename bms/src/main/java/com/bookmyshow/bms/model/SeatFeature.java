package com.bookmyshow.bms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "seatfeatures")
public class SeatFeature extends Auditable {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String description;

//    public SeatFeature(){}
}
