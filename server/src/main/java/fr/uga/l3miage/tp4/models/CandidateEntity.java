package fr.uga.l3miage.tp4.models;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity

public class CandidateEntity extends  UserEntity{

    private LocalDate birthDate;

    private boolean hasExtraTime;

    @ManyToOne // estRattachéA
    private TestCenterEntity testCenter;

    @OneToMany(mappedBy = "candidateEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}
