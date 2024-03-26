package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EvaluationCriteriaEntity {
    @Id
    private long id;
    @Column(nullable = false)
    private String description;

    private boolean hasCandidatePerformedCriteria;

    @ManyToMany(mappedBy = "EvaluationCriteriaEntities")
    private Set<CandidateEvaluationGridEntity> CandidateEvaluationGridEntities;

}
