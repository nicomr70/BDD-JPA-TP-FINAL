package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EvaluationCriterialEntity {
    @Id
    private Long id;
    @Column(nullable = false)
    private  String description;
    private boolean hasCandidatePerformedCriteria;
}
