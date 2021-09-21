package com.api.JavaBackendExercise.controller;

import com.api.JavaBackendExercise.model.Traffic;
import com.api.JavaBackendExercise.service.TrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrafficController {

    @Autowired
    private TrafficService trafficservice;

    @GetMapping("/traffic")
    public Iterable<Traffic> getAllTraffic() {
        return trafficservice.getTraffic();
    }
}
