package com.example.FindNearbyRestaurant.Reppository;

import com.example.FindNearbyRestaurant.Entity.Store;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StoreRespository extends CrudRepository<Store, String> {
//    Optional<Store> findByEmail(String email);


//    boolean existsByEmail(String email);

}
