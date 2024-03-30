package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EvaluationCriteriaEntity {
    @Id
    private Long id;
    @Column(nullable = false)
    private String description;
    private boolean hasCandidatePerformedCriteria;

    @ManyToMany
    @JoinColumn(name = "candidate_evaluation_id", referencedColumnName = "sheet_number")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}
