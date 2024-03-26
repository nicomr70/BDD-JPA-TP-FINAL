package fr.uga.l3miage.tp4.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;

    private double grade;
    private LocalDate submissionDate;

    // To triple check, I'm tired
    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntities;
    //TODO: ManyToOne relationship with CandidateEntity
    //TODO: ManyToOne relationship with yet to create ExamEntity
}
