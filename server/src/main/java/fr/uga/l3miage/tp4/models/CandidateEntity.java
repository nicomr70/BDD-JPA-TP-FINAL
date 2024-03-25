package fr.uga.l3miage.tp4.models;




import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@DiscriminatorValue("candidate")
public class CandidateEntity extends UserEntity {
    private LocalDate birthDate;

    private Boolean hasExtraTime;

    @OneToMany(mappedBy = "CandidateEntity",cascade = CascadeType.ALL)
    private Set<CandidateEvaluationGridEntity> aPourGrillesEvaluations;

    @ManyToOne
    private TestCenterEntity estRattachéA;
}
