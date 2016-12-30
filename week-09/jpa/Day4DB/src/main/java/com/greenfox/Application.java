package com.greenfox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demoCust(CustomerRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));

            for (Customer customer : repository.findByLastName("Bauer")) {
                log.info(customer.toString());
            }

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customer customer = repository.findOne(1L);
            log.info("Customer found with findOne(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            for (Customer bauer : repository.findByLastName("Bauer")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }

    @Bean
    public CommandLineRunner demoProd(ProductRepository repository) {
        return (args) -> {
            // save a couple of products
            repository.save(new Product("Christmas Tree", 8000));
            repository.save(new Product("Red balls - sixpack", 500));
            repository.save(new Product("Chocolate Santa", 300));
            repository.save(new Product("Present box", 450));

            // fetch all products
            log.info("Products found with findAll():");
            log.info("-------------------------------");
            for (Product product : repository.findAll()) {
                log.info(product.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Product product = repository.findOne(1L);
            log.info("Product found with findOne(1L):");
            log.info("--------------------------------");
            log.info(product.toString());
            log.info("");

            // fetch products by name
            log.info("Product found with findByName('Chocolate Santa'):");
            log.info("--------------------------------------------");
            for (Product santa : repository.findByName("Chocolate Santa")) {
                log.info(santa.toString());
            }
            log.info("");
        };
    }


}