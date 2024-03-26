package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    Long id ;
    LocalDateTime startDate;
    LocalDateTime endDate;
    @Column(unique = true)
    String name;
    int weight;
    @OneToMany(mappedBy = "exam")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;
    @ManyToMany
    private Set<SkillEntity> skills ;
    @ManyToOne
    private EcosSessionEntity ecosSession;



}
