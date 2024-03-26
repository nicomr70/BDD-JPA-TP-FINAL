package fr.uga.l3miage.tp4.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EvaluationCriteriaEntity {
    @Id
    private long id;
    @Column(nullable = false)
    private String description;

    private boolean hasCandidatePerformedCriteria;


    @ManyToMany(mappedBy = "evaluationCriteria")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}
