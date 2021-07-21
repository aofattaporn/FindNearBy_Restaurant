package com.example.FindNearbyRestaurant.ApiTest;

import com.example.FindNearbyRestaurant.Business.StoreBusiness;
import com.example.FindNearbyRestaurant.Entity.Store;
import com.example.FindNearbyRestaurant.Model.MRequestLatLong;
import com.example.FindNearbyRestaurant.Model.RequestAddRestaurant;
import com.example.FindNearbyRestaurant.Model.RequestNearbyRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/test")
public class StoreApi {

    @Autowired
    private StoreBusiness storeBusiness;

//    test get method
    @GetMapping
    public MRequestLatLong test(){
        MRequestLatLong test = new MRequestLatLong();
        test.setLatitude(1232.2323);
        test.setLongitude(2324.3434);
        return test;
    }
//    test
    @PostMapping("/calculate_distance")
    public String GetLatLong(@RequestBody MRequestLatLong requestLatLong) {

        return "hello lnw aof";
    }

    @PostMapping("/addrestaurant")
    public ResponseEntity<Store> addRestaurant(@RequestBody RequestAddRestaurant request) {
        return ResponseEntity.ok(storeBusiness.addRestaurant(request));
    }

    @GetMapping("/getAllRestaurant")
    public ResponseEntity<List<Store>> getAllRestaurant() {
        return ResponseEntity.ok(storeBusiness.getAllRestaurant());
    }

    @PostMapping("/findNearbyRestaurant")
    public ResponseEntity<Store> findNearbyRestaurant(@RequestBody RequestNearbyRestaurant request) {
        return ResponseEntity.ok(storeBusiness.findNearbyRestaurant(request));
    }
}
