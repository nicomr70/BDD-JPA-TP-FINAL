package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ExamEntity {
    @Id
    private Long Id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true)
    private String name;
    private int weight;
}
