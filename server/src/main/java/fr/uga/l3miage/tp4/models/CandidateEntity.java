package fr.uga.l3miage.tp4.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

@Entity
public class CandidateEntity extends UserEntity{
    private LocalDate birthDate;
    private boolean hasExtraTime;

    @ManyToOne
    private TestCenterEntity testCenterEntity;

    @OneToMany(mappedBy = "candidateEntity")
    Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

}
