package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
public class EvaluationCriteriaEntity {

    @Id
    private Long id;
    @Column(nullable = false)
    private String description;
    private Boolean hasCandidatePerformedCriteria;

}
