package com.greenfox.reddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApp {

    /*@Bean
    public Java8TimeDialect java8TimeDialect() {
        return new Java8TimeDialect();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(RedditApp.class, args);
    }

    //check jdbcauthentication - in an @enableauthentication class

}
