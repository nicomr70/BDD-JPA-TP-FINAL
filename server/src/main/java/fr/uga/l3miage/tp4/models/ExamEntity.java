package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
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

    @ManyToMany
    private Set<SkillEntity> skillEntities;

    @ManyToOne
    private EcosSessionEntity ecosSessionEntity;
}
