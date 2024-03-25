package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private long sheetNumber;
    private double grade;
    private LocalDateTime submissionDate;
    @ManyToMany
    private Set<EvaluationCriteriaEntity>evaluationCriteriaEntities;
    @OneToMany
    private Set<ExaminerEntity> examiner;
    @ManyToOne
    private CandidateEntity candidate;
}
