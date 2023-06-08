package com.railway.TrainDetails.repositories;

import com.railway.TrainDetails.models.Train_details;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainRepository extends JpaRepository<Train_details, String> {


   // List<Train_details> findBySort(String origin, String destination);

}
