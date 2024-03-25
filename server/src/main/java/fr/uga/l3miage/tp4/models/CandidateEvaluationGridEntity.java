package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;

    private Double grade;

    private LocalDateTime submissionDate;

    @ManyToMany
    private Set<EvaluationCriteriaEntity> EvaluationCriterias;

    @ManyToOne()
    private ExamEntity exam;
}
