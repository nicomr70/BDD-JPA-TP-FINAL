package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class EvaluationCriteriaEntity {

    @Id
    Long id;
    @Column(nullable = false)
    String description;
    boolean hasCandidatePerformedCriteria;

    @ManyToMany(mappedBy = "evaluationCriterias")
    Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;

}
