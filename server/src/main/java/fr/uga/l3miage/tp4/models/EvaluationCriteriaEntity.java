package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EvaluationCriteriaEntity {
    @Id
    private Long id;
    @Column(nullable = false)
    private String description;

    private  boolean hasCandidatePerformedCriteria;


    @ManyToMany
    @JoinTable(name="evaluation_criteria_candidate_evaluation_grid",joinColumns ={@JoinColumn(name = "evaluation_criteria_id")},inverseJoinColumns = {@JoinColumn(name = "candidate_evaluation_grid_id")})


    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;



}
