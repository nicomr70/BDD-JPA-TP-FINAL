package fr.uga.l3miage.tp4.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CandidateEntity extends UserEntity{
    private LocalDate birthDate;
    private boolean hasExtraTime;
    @ManyToOne
    private TestCenterEntity testCenterEntity;


    @OneToMany(mappedBy = "candidateEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;

}
