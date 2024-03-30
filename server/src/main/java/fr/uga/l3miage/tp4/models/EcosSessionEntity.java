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
    private EcosSessionEntity ecosSessionEntity;

    @OneToMany
    @JoinColumn(name = "exam_id", referencedColumnName = "ecos_session_id")
    private Set<ExamEntity> examEntities;
}
