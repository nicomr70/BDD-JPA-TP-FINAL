package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
@Getter
@Setter
@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long SheetNumber;

    @Column(precision = 2)
    private double grade;

    private LocalDateTime submissionDate;

    @ManyToOne
    private ExamEntity examEntity;

    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntities;

    @ManyToOne
    private CandidateEntity candidateEntity;
    @ManyToOne
    private ExaminerEntity examinerEntity;


}
