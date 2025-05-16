package com.new1.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne //many order items have same food
    private Food food;

    private int quantity;

    private Long totalPrice;

    private List<String> ingredients;

}
