package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private  Long sheetNumber;
    @Column(nullable = false)
    @DecimalMin(value = "0.00", inclusive = true, message = "La note doit être positive")
    @DecimalMax(value = "20.00", inclusive = true, message = "La note ne peut pas dépasser 20")
    private Double grade;
    private LocalDateTime submissionDate;
    @ManyToMany(mappedBy = "CandidateEvaluationGrid")
    private Set<EvaluationCriteriaEntity> evaluationCriterias ;
    @ManyToOne
    private CandidateEntity candidateEntity;
    @ManyToOne
    private ExamEntity exam;
}
