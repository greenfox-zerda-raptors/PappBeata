package com.greenfox;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    private String type;
    public String description;
    private Integer calories;
    private LocalDate date;

    public Meal(String type, String description, Integer calories) {
        this.type = type;
        this.description = description;
        this.calories = calories;
        //to check
        date = LocalDate.now();
    }

    protected Meal() {
    }
}
