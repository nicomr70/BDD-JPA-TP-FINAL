package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private  Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true)
    private String name;
    private Integer weight;

    @OneToMany
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;

    @ManyToMany(mappedBy = "exam") // La liste des compétences requises pour un exam
    private Set<SkillEntity> skills;
    @ManyToOne // une EcosSession
    private EcosSessionEntity ecosSession;
}
