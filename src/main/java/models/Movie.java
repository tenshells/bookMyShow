package models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie extends BaseModel{
    private String name;
    private List<String> cast;
    private String genre;
    private List<String> languages;
}
