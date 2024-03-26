package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@Entity
public class EvaluationCriteriaEntity {
    @Id
    private Long id;

    @Column(nullable = false)
    private String description;

    private boolean hasCandidatePerformedCriteria;

    @ManyToMany(mappedBy = "evaluationCriteriaEntities")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;


}
