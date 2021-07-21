package com.example.FindNearbyRestaurant.Business;

import com.example.FindNearbyRestaurant.Entity.Store;
import com.example.FindNearbyRestaurant.Model.RequestAddRestaurant;
import com.example.FindNearbyRestaurant.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreBusiness {

    @Autowired
    private RestaurantService restaurantService;

    public Store addRestaurant(RequestAddRestaurant request) {
        return restaurantService.create(request);
    }

    public Iterable<Store> getAllRestaurant() {
        return restaurantService.getAllRestaurant();
    }


}
