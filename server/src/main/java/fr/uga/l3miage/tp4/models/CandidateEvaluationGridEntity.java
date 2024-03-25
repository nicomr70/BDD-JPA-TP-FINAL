package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long SheetNumber;

    private double grade;

    private LocalDateTime submissionDate;

    @ManyToOne
    private ExamEntity examEntity;

    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntities;
}
