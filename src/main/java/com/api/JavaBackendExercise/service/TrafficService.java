package com.api.JavaBackendExercise.service;

import com.api.JavaBackendExercise.model.Traffic;
import com.api.JavaBackendExercise.repository.TrafficRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TrafficService {
    @Autowired
    private TrafficRepository trafficRepository;

    public Iterable<Traffic> getTraffic() {
        return trafficRepository.findAll();
    }

}


