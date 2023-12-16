package com.scaler.bookmyshow.models;

import java.sql.Time;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "'Show'")
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;
    private Time moviestartTime;
    private Time movieendTime;

    @ManyToOne
    private Screen screen;

    // @Enumerated(EnumType.ORDINAL)
    // @ElementCollection
    // private List<Feature> features;
}
