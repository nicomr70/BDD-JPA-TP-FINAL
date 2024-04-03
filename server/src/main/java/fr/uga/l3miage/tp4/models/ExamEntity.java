package fr.uga.l3miage.tp4.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class ExamEntity {
    @Id
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private int weight;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy= "examEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToMany
    private Set<SkillEntity> skillEntities;

    @ManyToOne
    private EcosSessionEntity ecosSessionEntity;

}