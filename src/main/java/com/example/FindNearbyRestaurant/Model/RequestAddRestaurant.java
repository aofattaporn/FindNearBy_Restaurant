package com.example.FindNearbyRestaurant.Model;

import lombok.Data;

@Data
public class RequestAddRestaurant {
    private String name;
    private double lat;
    private double lng;
}
