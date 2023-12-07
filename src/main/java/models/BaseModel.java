package models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseModel {
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime lastUpdatedAt;    
}
