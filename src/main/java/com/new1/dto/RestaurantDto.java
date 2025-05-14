package com.new1.dto;

import jakarta.persistence.Column;

import java.util.List;

public class RestaurantDto {

    private String Title;

    @Column(length = 1000)
    private List<String> images;

    private String description;

    private Long id;

}
