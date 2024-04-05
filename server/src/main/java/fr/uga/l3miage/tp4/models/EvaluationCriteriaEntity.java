
package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.repositories.EvaluationCriteriaRepository;
import lombok.*;
import javax.persistence.*;
@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EvaluationCriteriaEntity {

    @Id
    private Long id;

    @Column(nullable = false)
    private String description;

    private boolean hasCandidatePerformedCriteria;
}
