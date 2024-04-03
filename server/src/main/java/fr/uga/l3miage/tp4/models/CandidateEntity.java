package fr.uga.l3miage.tp4.models;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;
@Entity
@Data

public class CandidateEntity extends UserEntity{
    private LocalDate birthDate;
    private boolean hasExtraTime;
    @OneToMany(mappedBy = "candidat")
    private Set<CandidateEvaluationGridEntity> gridEvaluation;

    @ManyToOne()
    private TestCenterEntity testCenterEntity;


}
