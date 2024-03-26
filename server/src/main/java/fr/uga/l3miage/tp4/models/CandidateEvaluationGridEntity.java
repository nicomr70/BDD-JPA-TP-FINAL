package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;
    private double grade;
    private LocalDateTime submissionDate;
    @ManyToMany
    private Set<EvaluationCriteriaEntity>evaluationCriterias;
    @ManyToOne
    private ExaminerEntity examiner;
    @ManyToOne
    private CandidateEntity candidate;
    @ManyToOne
    private ExamEntity exam;
}
