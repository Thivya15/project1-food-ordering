package com.new1.model;

import jakarta.persistence.*;

@Entity
public class IngredientsItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne  //many ingredients have same category
    private IngredientCategory category;

    @ManyToOne  //one restaurant has multiple ingredients
    private Restaurant restaurant;

    private boolean inStock=true;


}
