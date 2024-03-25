package fr.uga.l3miage.tp4.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@DiscriminatorValue("exam")
public class ExaminerEntity extends UserEntity{

    private String login;
    private String password;

    @ManyToOne
    private TestCenterEntity testCenterEntity;

    @OneToMany
    private Set<CandidateEvaluationGridEntity> candiateEvaluationGridEntities;
}
