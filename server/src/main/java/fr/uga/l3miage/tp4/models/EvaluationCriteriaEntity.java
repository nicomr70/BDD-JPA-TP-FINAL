package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
public class EvaluationCriteriaEntity {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="description", nullable=false)
    private String description;

    @Column(name="has_candidate_performed_criteria")
    private boolean hasCandidatePerformedCriteria;
}
