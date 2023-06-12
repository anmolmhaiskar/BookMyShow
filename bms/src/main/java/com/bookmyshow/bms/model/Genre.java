package com.bookmyshow.bms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "genres")
public class Genre extends Auditable{
    private String name;

    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Movie> movies = new ArrayList<>();

//    public Genre(){}
}
