package com.bookmyshow.bms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "cities")
public class City extends Auditable{
    private String name;
    private String state;
    private String country;

    @OneToMany(mappedBy = "city")
    private List<Cinema> cinemas = new ArrayList<>();

//    public City(){}
}
