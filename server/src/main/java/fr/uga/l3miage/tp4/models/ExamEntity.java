package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ExamEntity {
    @Id
    @Column(name="id")
    private Long id;

    @Column(unique=true)
    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private SessionStatus status;

}
