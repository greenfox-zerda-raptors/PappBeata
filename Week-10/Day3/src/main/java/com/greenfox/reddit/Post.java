package com.greenfox.reddit;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Table(name = "posts")
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    String content;
    Date date;
    Integer score = 0;

    public Post(String content) {
        this.content = content;
    }

    public Post() {
    }
}
