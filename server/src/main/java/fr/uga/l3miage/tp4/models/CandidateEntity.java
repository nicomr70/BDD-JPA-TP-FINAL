package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class CandidateEntity extends UserEntity{
    private LocalDate birthDate;
    private boolean hasExtratime;
    @ManyToOne
    @JoinColumn(name = "testCenterEntity")
    private TestCenterEntity testCenterEntity;

    @OneToMany(mappedBy = "candidateEvaluationGridEntity",cascade = CascadeType.ALL)
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntity;



}
