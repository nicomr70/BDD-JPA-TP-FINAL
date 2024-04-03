package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

import lombok.Data;

@Entity
@Data
public class EvaluationCriteriaEntity {
    @Id
    private Long id;
    @Column(nullable = false)
    private String description;

    private  boolean hasCandidatePerformedCriteria;

    @ManyToMany()
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntity;

}