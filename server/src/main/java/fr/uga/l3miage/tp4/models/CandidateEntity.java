package fr.uga.l3miage.tp4.models;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class CandidateEntity extends UserEntity {
    private LocalDate birthDate;
    private boolean hasExtraTime;

    @ManyToOne
    private TestCenterEntity testCenters;
    @OneToMany (mappedBy = "candidate")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}