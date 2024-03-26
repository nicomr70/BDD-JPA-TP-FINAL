package fr.uga.l3miage.tp4.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EvaluationCriteriaEntity {
    @Id
    private Long id;

    @Column(nullable = false, name = "description")
    String description;

    boolean hasCandidatePerformedCriteria;

    @ManyToMany(mappedBy = "evaluationCriteria")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;
    /*
     * Relation: bidirectionnelle "évalue" entre EvaluationCriteriaEntity et CandidateEvaluationGridEntity
     * génère la table d'association 'evaluationCriteria_candidateEvaluationGridEntities', tq:
     * clé primaire: private Long id (de 'EvaluationCriteriaEntity') et private Long sheetNumber (de 'CandidateEvaluationGridEntity')
     * */
}
