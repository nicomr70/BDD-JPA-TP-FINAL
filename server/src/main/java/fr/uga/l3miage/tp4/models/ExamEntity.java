package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class ExamEntity {
    @Id
    Long id ;
    LocalDateTime startDate;
    LocalDateTime endDate;
    @Column(unique = true)
    String name;
    int weight;


}
