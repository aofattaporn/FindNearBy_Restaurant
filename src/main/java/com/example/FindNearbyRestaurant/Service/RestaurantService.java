package com.example.FindNearbyRestaurant.Service;

import com.example.FindNearbyRestaurant.Entity.Store;
import com.example.FindNearbyRestaurant.Model.RequestAddRestaurant;
import com.example.FindNearbyRestaurant.Reppository.StoreRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private StoreRespository storeRespository;

    public Store create(RequestAddRestaurant request) {
        Store store = new Store();
        store.setName(request.getName());
        store.setLatitude(request.getLat());
        store.setLongitude(request.getLng());

        return storeRespository.save(store);
    }

    public List<Store> getAllRestaurant() {
        return (List<Store>) storeRespository.findAll();
    }
}
