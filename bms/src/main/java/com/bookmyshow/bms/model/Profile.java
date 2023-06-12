package com.bookmyshow.bms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Builder
@Table(name = "profiles")
public class Profile extends Auditable{
    @OneToOne
    private User user;

    private String username;

    private String url;
    private String address;
    private String primaryPhone;
    private String picURL;

//    public Profile(){}
}
