package fr.uga.l3miage.tp4.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
@DiscriminatorValue("CandidateEntity")
public class CandidateEntity extends UserEntity{
    private LocalDate birthDate;
    private boolean hasExtratime;

    @OneToMany(mappedBy = "candidate")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToOne
    private Set<TestCenterEntity> testCenterEntities;
}
