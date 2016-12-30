package com.greenfox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repositoryCust, ProductRepository repositoryProd, OrderRepository repositoryOrd) {
        return (args) -> {
            // save a couple of customers
            repositoryCust.save(new Customer("Jack", "Bauer"));
            repositoryCust.save(new Customer("Chloe", "O'Brian"));
            repositoryCust.save(new Customer("Kim", "Bauer"));
            repositoryCust.save(new Customer("David", "Palmer"));
            repositoryCust.save(new Customer("Michelle", "Dessler"));

            for (Customer customer : repositoryCust.findByLastName("Bauer")) {
                log.info(customer.toString());
            }

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repositoryCust.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customer customer = repositoryCust.findOne(1L);
            log.info("Customer found with findOne(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            for (Customer bauer : repositoryCust.findByLastName("Bauer")) {
                log.info(bauer.toString());
            }
            log.info("");

            // save a couple of products
            repositoryProd.save(new Product("Christmas Tree", 8000));
            repositoryProd.save(new Product("Red balls - sixpack", 500));
            repositoryProd.save(new Product("Chocolate Santa", 300));
            repositoryProd.save(new Product("Present box", 450));

            // fetch all products
            log.info("Products found with findAll():");
            log.info("-------------------------------");
            for (Product product : repositoryProd.findAll()) {
                log.info(product.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Product product = repositoryProd.findOne(1L);
            log.info("Product found with findOne(1L):");
            log.info("--------------------------------");
            log.info(product.toString());
            log.info("");

            // fetch products by name
            log.info("Product found with findByName('Chocolate Santa'):");
            log.info("--------------------------------------------");
            for (Product santa : repositoryProd.findByName("Chocolate Santa")) {
                log.info(santa.toString());
            }
            log.info("");


            // save a couple of orders
            repositoryOrd.save(new Order("Christmas shopping", repositoryCust.findOne(1L)));
            repositoryOrd.save(new Order("Shopping missing items", repositoryCust.findOne(1L)));
            repositoryOrd.save(new Order("Christmas presents Kim Bauer", repositoryCust.findOne(2L)));

            List<Item> items1 = new ArrayList<Item>();
            items1.add(new Item(repositoryProd.findOne(1L), 1, repositoryOrd.findOne(1L)));
            items1.add(new Item(repositoryProd.findOne(2L), 2, repositoryOrd.findOne(1L)));
            items1.add(new Item(repositoryProd.findOne(3L), 5, repositoryOrd.findOne(1L)));
            items1.add(new Item(repositoryProd.findOne(4L), 6, repositoryOrd.findOne(1L)));

            List<Item> items2 = new ArrayList<Item>();
            items2.add(new Item(repositoryProd.findOne(3L), 2, repositoryOrd.findOne(2L)));

            List<Item> items3 = new ArrayList<Item>();
            items3.add(new Item(repositoryProd.findOne(3L), 3, repositoryOrd.findOne(3L)));
            items3.add(new Item(repositoryProd.findOne(4L), 3, repositoryOrd.findOne(3L)));

            repositoryOrd.findOne(1L).items = items1;
            repositoryOrd.findOne(2L).items = items2;
            repositoryOrd.findOne(3L).items = items3;

            log.info("");

        };
    }
}