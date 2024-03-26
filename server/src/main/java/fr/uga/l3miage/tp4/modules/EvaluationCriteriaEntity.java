package fr.uga.l3miage.tp4.modules;

import fr.uga.l3miage.tp4.components.CandidateComponent;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class EvaluationCriteriaEntity {

    @Id
    private long id;

    @Column(nullable = false)
    private String description;

    @Column(name = "has_candidate_performed_criteria")
    private boolean hasCandidatePerformedCriteria;

    @ManyToMany
    @JoinTable(
            name = "evaluationCriteria_candidateEvaluation", //name of the tbale thats we gonna creat
            joinColumns = @JoinColumn(name = "id"), //id of the current entity
            inverseJoinColumns = @JoinColumn(name = "sheet_number") //id of the entity that we wanna creat a link with
    )
    private Set<CandidateComponent> candidateComponents;

}
