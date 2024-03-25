package fr.uga.l3miage.tp4.models;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;
@Getter
@Entity
public class CandidateEntity extends UserEntity {
    private LocalDate birthDate;
    private boolean hasExtraTime;

    @OneToMany(mappedBy = "candidateEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
    @ManyToOne
    private TestCenterEntity testCenterEntity;
}
