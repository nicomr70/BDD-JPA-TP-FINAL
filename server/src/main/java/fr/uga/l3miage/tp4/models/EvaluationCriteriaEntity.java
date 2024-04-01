package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class EvaluationCriteriaEntity {
    @Id
    private Long id;
    @Column(nullable = false)
    private String description;
    private  Boolean hasCandidatePerformedCriteria;
    @ManyToMany // La Liste des grilles d'evaluation d'un candidat
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;
}
