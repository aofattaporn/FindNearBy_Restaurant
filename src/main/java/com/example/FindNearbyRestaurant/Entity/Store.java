package com.example.FindNearbyRestaurant.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.Entity;
import javax.persistence.Column;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "Store")
public class Store extends BaseEntity{

    @Column(nullable = false, length = 120)
    private String name;

    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double longitude;


}
