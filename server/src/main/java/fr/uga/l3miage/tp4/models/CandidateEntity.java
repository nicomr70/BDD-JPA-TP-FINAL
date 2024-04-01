package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class CandidateEntity extends UserEntity {
    private LocalDate birthDate;
    private Boolean hasExtraTime;

    @ManyToOne
    private TestCenterEntity testCenter;
    @OneToMany(mappedBy = "candidate")
    private Set<CandidateEvaluationGridEntity> gridEntities;
}
