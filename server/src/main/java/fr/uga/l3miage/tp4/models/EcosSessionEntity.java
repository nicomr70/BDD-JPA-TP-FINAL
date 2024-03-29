package fr.uga.l3miage.tp4.models;


import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class EcosSessionEntity {

    @Id
    private Long id;

    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @Enumerated(EnumType.STRING)
    private SessionStatus status;

    @OneToMany(mappedBy = "ecosSessionEntity")
    private Set<ExamEntity> exams;

    @OneToOne
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntity;
}
