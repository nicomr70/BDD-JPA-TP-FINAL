package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class EvaluationCriteriaEntity {
    @Id
    Long id ;
    @Column(nullable = false)
    String description ;
    boolean hasCandidatePerformedCriteria;
    @OneToMany
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;
}
