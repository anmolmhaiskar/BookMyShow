package com.bookmyshow.bms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@Table(name = "cinemas")
public class Cinema extends Auditable{
    private boolean hasParking = true;
    private boolean hasDiner;

    @NotNull
    private String address;

    @NotNull
    private String name;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "cinema")
    private List<Auditorium> halls = new ArrayList<>();

//    public Cinema(){}
}
