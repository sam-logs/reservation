package com.railway.TrainDetails.controller;

import com.railway.TrainDetails.models.Train_details;
import com.railway.TrainDetails.repositories.TrainRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/search")
public class TrainController {
	
	@Autowired
    private TrainRepository trainRepository;

    public TrainController(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @PostMapping("/addTrain")
    public String saveTrain(@RequestBody Train_details id) {  //convert the body of the HTTP request to the java class object
        trainRepository.save(id);
        return "Added train with id :  " + id.getId();
    }

    @GetMapping("{id}")
    public Optional<Train_details> getTrain(@PathVariable String id) {
        return trainRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTrain(@PathVariable String id) {
        trainRepository.deleteById(id);
        return "Train deleted with id : " + id;
    }

    @PutMapping("/update/{id}")
    public Train_details updateTrain(@PathVariable("id") String id, @RequestBody Train_details t) {
        t.setId(id);
        trainRepository.save(t);
        return t;

    }

}
