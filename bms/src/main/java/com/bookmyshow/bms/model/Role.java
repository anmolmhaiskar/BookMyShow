package com.bookmyshow.bms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "roles")
public class Role extends Auditable {
    @NotBlank
    @Column(unique = true)
    @Getter @Setter
    private String name;

    @NotBlank
    @Getter @Setter
    private String description;

//    public Role(){}
}
