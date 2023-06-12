package com.bookmyshow.bms.model;
import jakarta.persistence.Entity;
import lombok.Data;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name = "transactions")
public class Transaction extends Auditable {

    @ManyToOne
    private Booking booking;

    private TransactionStatus status = TransactionStatus.NEW;

    private String paymentGateway;

    private double amount;

//    public Transaction(){}
}
