package com.greenfox.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    private String name;
    private Integer price;

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s', price=%d]", id, name, price);
    }

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    protected Product() {
    }
}