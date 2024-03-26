package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true)
    private String name;

    private int weight;

    @OneToMany(mappedBy = "CandidateEvaluationGridEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntity;

    @OneToMany(mappedBy = "CandidateEvaluationGridEntities")
    private Set<CandidateEvaluationGridEntity> CandidateEvaluationGridEntities;

    @ManyToMany
    @JoinTable(
            name = "SkillAEvalue",
            joinColumns = @JoinColumn(name = "exam_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<SkillEntity> skillEntities;

}
