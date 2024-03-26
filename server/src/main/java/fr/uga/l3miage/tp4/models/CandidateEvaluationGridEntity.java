package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    Long sheetNumber;
    double grade ;
    LocalDateTime submissionDate;
    @ManyToOne
    private CandidateEntity candidate ;
    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriterias;
    @ManyToOne
    private ExamEntity exam ;



}
