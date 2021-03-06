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
    private String content;
    private Date date;
    private Integer score = 0;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    User user;

    public Post() {
        date = new Date();
    }

    public Post(String content) {
        this();
        this.content = content;
    }
}
