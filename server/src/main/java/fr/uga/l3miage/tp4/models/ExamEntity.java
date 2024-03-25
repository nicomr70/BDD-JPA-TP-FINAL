package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    @Column(name="id")
    private Long id;

    @Column(unique=true)
    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private SessionStatus status;

    @OneToMany(mappedBy="exam")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;

    @ManyToMany(mappedBy = "exams")
    private Set<SkillEntity> skills;
}
