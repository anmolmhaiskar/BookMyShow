package com.bookmyshow.bms.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User extends Auditable {
    @ManyToMany(fetch = FetchType.EAGER)
    Set<Role> roles = new HashSet<>();
    @Email
    @NotBlank
    @Column(unique = true)
    private String email;
    @NotBlank
    private String saltedHashedPassword;

    public User(User user) { // copy constructor
        email = user.getEmail();
        saltedHashedPassword = user.getSaltedHashedPassword();
        roles = user.getRoles();
    }

    public void setSaltedHashedPassword(String value) {
        this.saltedHashedPassword = new BCryptPasswordEncoder(5).encode(value);
    }
}
