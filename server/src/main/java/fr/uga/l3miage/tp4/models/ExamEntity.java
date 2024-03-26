package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true)
    private String name;
    private Integer weight;
    @OneToMany(mappedBy = "examEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToMany
    @JoinColumn(name = "id_skill", referencedColumnName = "id")
    private Set<SkillEntity> skillEntities;
    @ManyToOne
    private EcosSessionEntity ecosSessionEntity;

}
