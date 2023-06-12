package com.bookmyshow.bms.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@Table(name = "movieshows")
public class MovieShow extends Auditable{

    private Date timingFrom;
    private Date timingTo;

    @OneToMany(mappedBy = "show")
    private List<Booking> bookings = new ArrayList<>();

    @ManyToOne
    private Auditorium auditorium;

    @ManyToOne
    @JsonBackReference
    @NotNull
    private Movie movie;

//    public MovieShow(){}
}
