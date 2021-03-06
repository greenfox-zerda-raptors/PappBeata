package com.greenfox.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    private String name;

    private Date createdAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER, mappedBy = "order")
    public List<Item> items;

    protected Order() {
        createdAt = new Date();
    }

    public Order(String name, Customer customer, List<Item> items) {
        this();
        this.name = name;
        this.customer = customer;
        this.items = items;
    }

    // reference to the customer table
}