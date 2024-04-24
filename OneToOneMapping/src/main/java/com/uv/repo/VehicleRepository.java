package com.uv.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uv.entity.Vehichle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehichle,Integer> {

}
