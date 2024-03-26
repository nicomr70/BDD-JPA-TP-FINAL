package fr.uga.l3miage.tp4.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity@Data
@NoArgsConstructor
@AllArgsConstructor

public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;
    private double grade;
    private LocalDateTime submissionDate;
    @ManyToOne
    private CandidateEntity candidateEntity;

    @ManyToOne
    private ExaminerEntity examinerEntity;
    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntities;

    @ManyToOne
    private ExamEntity examEntity;


}
