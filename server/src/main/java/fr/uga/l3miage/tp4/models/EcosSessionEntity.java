package fr.uga.l3miage.tp4.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;

import fr.uga.l3miage.tp4.enums.SessionStatus;

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
    private Set<ExamEntity> examEntities;
}
