package com.greenfox.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    public Order order;

    public Item(Product product, int quantity, Order order) {
        this.product = product;
        this.quantity = quantity;
        this.order = order;
    }

    protected Item() {
    }


}
