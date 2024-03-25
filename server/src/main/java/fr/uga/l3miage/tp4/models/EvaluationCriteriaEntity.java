package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Id;

public class EvaluationCriteriaEntity {
    @Id
    private Long id;

    @Column(nullable = false, name = "description")
    String description;
    
    boolean hasCandidatePerformedCriteria;
}
