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
public class CandidateEntity extends  UserEntity{

    private LocalDate birthDate;

    private boolean hasExtraTime;

    @ManyToOne
    private TestCenterEntity testCenter;

    @OneToMany(mappedBy = "candidat")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;
}
