package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EvaluationCriteriaEntity {
    @Id
    private Long id ;
    @Column(nullable = false)
    private String description ;
    private boolean hasCandidatePerformedCriteria ;
    @ManyToMany
    @JoinTable(name = "Table_Association_Eval_CandidateEval" ,
            joinColumns = @JoinColumn(name = "id") ,
            inverseJoinColumns = @JoinColumn(name = "sheetNumber")
    )
    private Set<CandidateEvaluationGridEntity> candidatesEvaluationGrids ;
}
