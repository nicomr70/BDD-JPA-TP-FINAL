package fr.uga.l3miage.tp4.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;

@Entity
public class ExamEntity {
    @Id
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @Column(unique = true)
    private String name;

    private int weight;

    @OneToMany(mappedBy = "examEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToOne
    EcosSessionEntity ecosSessionEntity;

    @ManyToMany
    Set<SkillEntity> skillEntities;
}
