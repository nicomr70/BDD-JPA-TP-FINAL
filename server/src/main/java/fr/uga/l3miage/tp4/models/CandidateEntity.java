package fr.uga.l3miage.tp4.models;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

    @OneToMany(mappedBy = "candidate")
    private Set<CandidateEvaluationGridEntity> evaluationGrids;

    @ManyToOne
    private TestCenterEntity testCenter;

}
