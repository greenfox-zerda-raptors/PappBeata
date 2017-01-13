package com.greenfox.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Long phoneNr;

    @ManyToMany(mappedBy = "phoneNumber")
    private Set<Customer> customer;

    public PhoneNumber(Long phoneNr) {
        this.phoneNr = phoneNr;
    }

}