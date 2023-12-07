package models;

import java.sql.Time;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Show extends BaseModel{
    private Movie movie;
    private Time startTime;
    private Time endTime;
    private Screen screen;
    private List<Feature> features;
}
