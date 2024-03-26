package fr.uga.l3miage.tp4.models;

import java.util.Set;

import javax.persistence.*;

import org.springframework.jmx.export.annotation.ManagedResource;

@Entity
public class EvaluationCriteriaEntity {
    @Id
    private Long id;

    @Column(nullable = false)
    private String description;
    
    private boolean hasCandidatePerformedCriteria;

    // To triple check, I'm tired
    @ManyToMany(mappedBy = "evaluationCriteriaEntities")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}
