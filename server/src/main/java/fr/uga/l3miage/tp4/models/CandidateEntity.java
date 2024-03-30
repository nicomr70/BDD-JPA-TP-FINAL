package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class CandidateEntity extends UserEntity{
    @Id
    private LocalDate birthDate;
    private boolean hasExtraTime;

    @ManyToOne
    @JoinColumn(name = "test_center_id")
    private TestCenterEntity testCenterEntities;

    @OneToMany
    @JoinColumn(name = "sheet_number", referencedColumnName = "id")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

}
