package com.greenfox.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String type;
    public String description;
    public Integer calories;
    private Date date;

    public Meal(String type, String description, Integer calories) {
        this();
        this.type = type;
        this.description = description;
        this.calories = calories;
    }

    public Meal() {
        date = new Date();
    }
}
