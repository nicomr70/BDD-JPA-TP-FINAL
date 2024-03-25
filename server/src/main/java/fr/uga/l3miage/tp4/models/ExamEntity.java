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

    @OneToMany(mappedBy = "exam")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;

    @ManyToMany(mappedBy = "exams")
    private Set<SkillEntity> skills;

    @ManyToOne
    private EcosSessionEntity ecosSession;

}
