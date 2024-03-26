package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class CandidateEntity extends UserEntity {
    LocalDate birthDate;
    boolean hasExtraTime ;
    @ManyToOne
    private TestCenterEntity testCenter ;
    @OneToMany
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids ;




}
