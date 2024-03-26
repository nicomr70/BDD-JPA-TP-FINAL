package fr.uga.l3miage.tp4.models;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.time.LocalDate;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CandidateEntity extends UserEntity{
    private LocalDate birthDate;
    private boolean hasExtratime;
    @ManyToOne
    private TestCenterEntity testCenterEntity;

    @OneToMany(mappedBy = "candidateEvaluationGridEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntity;

    @OneToMany(mappedBy = "candidate")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToOne
    private Set<TestCenterEntity> testCenterEntities;
}
