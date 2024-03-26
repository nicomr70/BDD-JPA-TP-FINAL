package fr.uga.l3miage.tp4.models;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CandidateEntity extends UserEntity {
    private LocalDate birthDate;
    private boolean hasExtraTime;

    @ManyToOne
    private TestCenterEntity testCenterEntity  ;
   @OneToMany (mappedBy = "candidateEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}