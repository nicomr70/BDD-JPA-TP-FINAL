package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class ExamEntity {
    @Id
    private  Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int weight;
}
