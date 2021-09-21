package com.api.JavaBackendExercise.model;

import javax.persistence.*;
import java.io.Serializable;

enum Move {
    ARRIVAL,
    DOMESTIC
}
enum FlightType {
    ARRIVAL,
    DOMESTIC
}

@Entity
@Table(name = "la_traffic")
public class Traffic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    String DATA_EXTRACT_DATE ;
    String REPORT_PERIOD;
    Move ARRIVAL_DEPARTURE;
    FlightType DOMESTIC_INTERNATIONAL;
    int PASSENGER_COUNT;
}
