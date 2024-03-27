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
    private int weight;

    @ManyToMany
    @JoinColumn(name = "skill_id", referencedColumnName = "exam_id")
    private Set<SkillEntity> skillEntities;

    @OneToMany
    @JoinColumn(name = "sheet_number", referencedColumnName = "exam_id")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToOne
    private EcosSessionEntity ecosSessionEntity;

}
