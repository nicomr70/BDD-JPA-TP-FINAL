package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class EcosSessionEntity {
    @Id
    private Long Id;
    @Column(unique = true)
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Enumerated(EnumType.STRING)
    private SessionStatus status;
    @OneToMany(mappedBy = "session")
    private Set<ExamEntity> exams;
    @OneToOne
    private EcosSessionEntity session;
}
