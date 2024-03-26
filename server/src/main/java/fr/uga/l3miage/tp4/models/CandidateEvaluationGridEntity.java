package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity extends UserEntity {
    @Id
    private long sheetNumber;
    private LocalDateTime submissionDate;
    private double grade;

    @ManyToMany
    @JoinTable(name = "EvaluationTableCandiadate",joinColumns = @JoinColumn(name = "Evaluation_id")
            ,inverseJoinColumns = @JoinColumn(name = "candidate_sheetnumber"))
    private Set<EvaluationCriteriaEntity> EvaluationCriteriaEntities;

    @ManyToOne
    @JoinColumn(name = "candidateEntity")
    private CandidateEntity candidateEntity;

    @ManyToOne
    @JoinColumn(name = "examEntity")
    private ExamEntity examEntity ;

}
