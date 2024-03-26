package fr.uga.l3miage.tp4.modules;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class CandidateEntity extends UserEntity{


    @Column(name = "birth_date")
    private LocalDate birthDate;


    @Column(name = "has_extra_time")
    private boolean hasExtraTime;

    @OneToMany(mappedBy = "candidateEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToOne
    @JoinColumn(name = "test_center_id")
    private TestCenterEntity testCenterEntity;
}
