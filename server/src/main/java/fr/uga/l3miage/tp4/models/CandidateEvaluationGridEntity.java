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

    @ManyToOne
    private CandidateEntity candidate;

    @ManyToOne
    private ExaminerEntity examiner;
    @ManyToMany
    private Set<EvaluationCriteriaEntity> criteria;

}
