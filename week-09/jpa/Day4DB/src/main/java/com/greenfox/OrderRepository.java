package com.greenfox;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByName(String name);

   /* List<Order> findByCustomer(Customer customer);

    List<Order> findById(Long id);*/
}