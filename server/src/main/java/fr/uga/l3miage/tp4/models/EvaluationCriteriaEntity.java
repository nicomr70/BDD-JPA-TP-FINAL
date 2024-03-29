package fr.uga.l3miage.tp4.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EvaluationCriteriaEntity {

    @Id
    private Long id;

    @Column(
            nullable = false
    )
    private String description;

    private boolean hasCandidatePerformedCriteria;


    @ManyToMany
    @JoinColumn(
            name = "sheetNumber"
    )
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}
