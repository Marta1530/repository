package com.tas.tastool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tas.tastool.domain.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {

}
