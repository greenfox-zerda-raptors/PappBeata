package com.greenfox.reddit;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    private String firstName;
    private String lastName;
    private String loginName;
    private String password;
}
