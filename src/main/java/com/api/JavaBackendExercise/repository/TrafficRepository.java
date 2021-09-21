package com.api.JavaBackendExercise.repository;

import com.api.JavaBackendExercise.model.Traffic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrafficRepository extends CrudRepository<Traffic, Long> {
}
