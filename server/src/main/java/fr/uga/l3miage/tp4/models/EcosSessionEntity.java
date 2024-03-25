package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class EcosSessionEntity {

    @Id
    private Long id;

    @Column(unique = true)
    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @Enumerated(EnumType.STRING)
    private SessionStatus status;

    @OneToOne
    private  EcosSessionProgrammationEntity ecosSessionProgrammationEntity;


    @OneToMany(mappedBy = "ecosSessionEntity")
    private Set<ExamEntity> examEntities;
}
