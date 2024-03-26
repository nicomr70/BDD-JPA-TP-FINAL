package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
public class CandidateEntity extends UserEntity{

    private LocalDate birthDate;
    private boolean hasExtraTime;

    @ManyToOne
    private TestCenterEntity testCenter;
    @OneToMany(mappedBy = "candidateEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

}
