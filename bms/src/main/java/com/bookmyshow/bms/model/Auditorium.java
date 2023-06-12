package com.bookmyshow.bms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Builder
@Data
@Table(name = "auditoriums")
public class Auditorium extends Auditable{

    private boolean hasAirConditioner;
    private int numberOfExits;
    private int numberOfEmergencyExits;
    private boolean canHost3D;
    private String hallName;

    @ManyToOne
    private Cinema cinema;

    @OneToMany(mappedBy = "auditorium")
    private List<AudiSeat> seats = new ArrayList<>();

    @OneToMany(mappedBy = "auditorium")
    private List<MovieShow> shows = new ArrayList<>();
//    public Auditorium(){}
}
