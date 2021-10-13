package com.example.FindNearbyRestaurant.ApiTest;

import com.example.FindNearbyRestaurant.Business.StoreBusiness;
import com.example.FindNearbyRestaurant.Model.MRequestLatLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class StoreApi {

    @Autowired
    private StoreBusiness storeBusiness;

    @GetMapping
    public MRequestLatLong test() {
        MRequestLatLong test = new MRequestLatLong();
        test.setLatitude(1232.2323);
        test.setLongitude(2324.3434);
        return test;
    }

    @PostMapping("/calculate_distance")
    public String GetLatLong(@RequestBody MRequestLatLong requestLatLong) {

        return "hello lnw aof";
    }
}
