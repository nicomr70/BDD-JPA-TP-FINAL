package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class EcosSessionEntity {

    @Id
    Long id;

    @Column(unique = true)
    String name;

    LocalDateTime startDate;
    LocalDateTime endDate;
    SessionStatus status;

    @OneToMany(mappedBy = "ecosSession")
    Set<ExamEntity> exams;

    @OneToOne
    EcosSessionProgrammationEntity ecosSessionProgrammation;
}
