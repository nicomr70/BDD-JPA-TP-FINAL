package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EvaluationCriteriaEntity {
    @Id
    private Long Id;

    @Column(nullable = false)
    private String description;

    private Boolean hasCandidatePerformedCriteria;

}
