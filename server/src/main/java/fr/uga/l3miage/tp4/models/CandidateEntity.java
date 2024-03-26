package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;
@Getter
@Setter
@Entity
public class CandidateEntity extends UserEntity {
    private LocalDate birthDate;
    private boolean hasExtraTime;

    @OneToMany(mappedBy = "candidateEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
    @ManyToOne
    private TestCenterEntity testCenterEntity;
}
