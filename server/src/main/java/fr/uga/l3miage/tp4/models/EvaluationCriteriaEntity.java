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

    @Column(nullable = false)
    private String description;

    private boolean hasCandidatePerformedCriteria;


}
