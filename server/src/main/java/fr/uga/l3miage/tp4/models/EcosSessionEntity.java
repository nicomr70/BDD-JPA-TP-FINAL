package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List; // Import List from java.util

@Entity
public class EcosSessionEntity {
    @Id
    private Long id;
    @Column(unique = true)
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private SessionStatus status;
    @OneToMany(mappedBy = "ecosSessionEntity")
    private List<ExamEntity> exams;
    @OneToOne
    private EcosSessionProgrammationEntity sessionProgrammation;
}