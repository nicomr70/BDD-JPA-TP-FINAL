package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {

    @Id
    private Long sheetNumber;

    @Column(precision = 2)
    private Double grade;
    private LocalDateTime submission_date;
    @ManyToMany
    @JoinColumn(name = "evaluation_criteria",referencedColumnName = "id")
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntities;
    @ManyToOne
    private ExamEntity examEntity;
    @ManyToOne
    private CandidateEntity candidate;

}
