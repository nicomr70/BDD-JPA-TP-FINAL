package fr.uga.l3miage.tp4.models;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;

    private double grade;
    private LocalDateTime submissionDate;

    @ManyToOne
    private CandidateEntity candidate;

    @ManyToMany(mappedBy = "candidateEvaluationGrids")
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntitySet;

    @ManyToOne
    private  ExamEntity exam;
}
