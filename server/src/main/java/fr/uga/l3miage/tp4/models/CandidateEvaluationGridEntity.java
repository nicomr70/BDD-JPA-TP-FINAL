package fr.uga.l3miage.tp4.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;

    private double grade;
    private LocalDateTime submissionDate;

    @ManyToOne
    private ExamEntity examEntity;

    @ManyToOne
    private CandidateEntity candidateEntity;

    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntities;

}