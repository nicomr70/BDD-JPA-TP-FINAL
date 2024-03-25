package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List; // Import List from java.util
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int weight;

    @ManyToMany
    private Set<SkillEntity> skills;
    @OneToMany(mappedBy = "exam")
    private List<CandidateEvaluationGridEntity> candidateEvaluationGrids;
    @ManyToOne
    private EcosSessionEntity ecosSessionEntity;
}