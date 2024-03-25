package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ExamEntity {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name", unique=true)
    private String name;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name="status")
    private SessionStatus status;

}
