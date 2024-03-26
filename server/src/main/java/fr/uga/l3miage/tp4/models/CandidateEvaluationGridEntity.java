package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    Long sheetNumber;
    @Column(precision = 2)
    double grade;
    LocalDateTime submissionDate;

    @ManyToOne
    ExamEntity examiner;

    @ManyToOne
    CandidateEntity candidate;

    @ManyToMany
    Set<EvaluationCriteriaEntity> evaluationCriterias;

    @ManyToOne
    ExamEntity exam;
}
