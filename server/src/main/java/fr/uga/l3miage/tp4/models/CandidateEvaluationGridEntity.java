package fr.uga.l3miage.tp4.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;

    private double grade;
    private LocalDate submissionDate;

    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntities;
    
    @ManyToOne
    private CandidateEntity candidateEntity;

    @ManyToOne
    private ExamEntity examEntity;
}
