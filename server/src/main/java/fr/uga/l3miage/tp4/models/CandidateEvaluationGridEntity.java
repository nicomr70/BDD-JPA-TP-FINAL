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

    @ManyToMany(mappedBy = "EvaluationGrids")
    private Set<EvaluationCriteriaEntity> criterias;

    @ManyToOne
    private CandidateEntity candidate;

    @ManyToOne
    private ExamEntity exam;
}
