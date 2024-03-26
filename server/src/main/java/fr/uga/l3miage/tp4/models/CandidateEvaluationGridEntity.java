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

    @Getter
    private double grade;

    private LocalDateTime submissionDate;

    @ManyToMany(mappedBy = "EvaluationGrids")
    private Set<EvaluationCriteriaEntity> criterias;

    @Getter
    @ManyToOne
    private CandidateEntity candidate;

    @ManyToOne
    private ExamEntity exam;


}
