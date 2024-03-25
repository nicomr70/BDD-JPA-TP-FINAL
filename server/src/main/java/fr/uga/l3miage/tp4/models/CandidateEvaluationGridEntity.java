package fr.uga.l3miage.tp4.models;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;
    private double grade;
    private LocalDateTime submissionDate;

    @ManyToOne
    @JoinColumn(name = "id_examiner", referencedColumnName = "id")
    private ExaminerEntity examiner;

    @ManyToOne
    private CandidateEntity candidate;
    @ManyToMany(mappedBy = "evaluationGrids")
    private Set<EvaluationCriteriaEntity> evaluationCriteria;

    @ManyToOne
    private ExamEntity exam;


}
