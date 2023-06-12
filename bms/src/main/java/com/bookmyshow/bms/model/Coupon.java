package com.bookmyshow.bms.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "coupons")
public class Coupon extends Auditable{
    private String code;
    private int maxUsage;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date expiresOn = new Date();

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Movie> movies = new ArrayList<>();

    @OneToMany(mappedBy = "coupon")
    private List<Booking> bookings = new ArrayList<>();

//    public Coupon(){}
}
