package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;
    private double grade ;
    private LocalDateTime submissionDate;

    @ManyToOne
    private ExamEntity exam;
    @ManyToOne
    private CandidateEntity candidate;
    @ManyToOne
    private ExaminerEntity examinerEntity;
    @ManyToMany (mappedBy = "candidateEvaluationGridEntities")
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntities;

}