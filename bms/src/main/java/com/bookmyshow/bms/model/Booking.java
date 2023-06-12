package com.bookmyshow.bms.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "bookings")
public class Booking extends Auditable{
    private double totalPrice = 0;

    @ManyToOne
    @JsonManagedReference
    private MovieShow show;

    @OneToMany(mappedBy = "booking")
    private List<ShowSeat> seats = new ArrayList<>();

    @OneToMany(mappedBy = "booking")
    private List<Transaction> transactions = new ArrayList<>();

    @ManyToOne
    private Coupon coupon;

    @ManyToOne
    private User user;

    public Booking(MovieShow show, User user){
        this.show = show;
        this.user = user;
    }
}
