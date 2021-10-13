package com.example.FindNearbyRestaurant.Business;

import com.example.FindNearbyRestaurant.Entity.Store;
import com.example.FindNearbyRestaurant.Model.RequestAddRestaurant;
import com.example.FindNearbyRestaurant.Model.RequestNearbyRestaurant;
import com.example.FindNearbyRestaurant.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreBusiness {

    @Autowired
    private RestaurantService restaurantService;

    public Store addRestaurant(RequestAddRestaurant request) {
        return restaurantService.create(request);
    }

    public List<Store> getAllRestaurant() {
        return restaurantService.getAllRestaurant();
    }

    public Store findNearbyRestaurant(RequestNearbyRestaurant request) {
        double minDistance = 10000.00;
        Store minRestaurant = new Store();
        List<Store> list = restaurantService.getAllRestaurant();
        for (int i = 0; i < list.size(); i++) {
            double distance = calculateDistance(request.getLat(),
                    request.getLng(),
                    list.get(i).getLatitude(),
                    list.get(i).getLongitude());
            if (distance < minDistance) {
                minDistance = distance;
                minRestaurant = list.get(i);
            }
        }

        return minRestaurant;
    }

    private double calculateDistance(double lat1,
                                     double lon1,
                                     double lat2,
                                     double lon2) {

        return Math.sqrt(Math.pow((lat2 - lat1), 2) + Math.pow((lon2 - lon1), 2));
    }

}
