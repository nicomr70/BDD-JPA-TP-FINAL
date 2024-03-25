package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class EcosSessionEntity {
    @Id
    private long id;
    @Column(unique = true) private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private SessionStatus status;

    @OneToMany(mappedBy="ecosSessionEntity")
    private Set<ExamEntity> examEntities;
}
