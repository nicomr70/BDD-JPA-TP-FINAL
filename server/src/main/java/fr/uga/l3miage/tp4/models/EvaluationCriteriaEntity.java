package fr.uga.l3miage.tp4.models;

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

    private String description;

    private boolean hasCandidatePerformedCriteria;

    @ManyToMany
    private Set<CandidateComponent> candidateComponents;

}
