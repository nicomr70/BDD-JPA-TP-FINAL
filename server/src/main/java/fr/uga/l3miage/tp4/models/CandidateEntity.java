package fr.uga.l3miage.tp4.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Getter
public class CandidateEntity extends  UserEntity{
    private LocalDate birthDate;
    private boolean hasExtraTime;

    @OneToMany(mappedBy = "candidate")
    private Set<CandidateEvaluationGridEntity> evaluationGrids;
    
    @ManyToOne
    private TestCenterEntity testCenter;
}

