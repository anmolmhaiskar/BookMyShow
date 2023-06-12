package com.bookmyshow.bms.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@Table(name = "movies")
public class Movie extends Auditable{
    private String name;
    private String director;
    private MPAARating mpaaRating;
    private String language;
    private Date releaseDate;
    private int duration;
    private String Summary;


    @OneToMany(mappedBy = "movie")
    private List<MovieShow> shows = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Genre> genres = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Coupon> coupons = new ArrayList<>();

//    public Movie(){}
}
