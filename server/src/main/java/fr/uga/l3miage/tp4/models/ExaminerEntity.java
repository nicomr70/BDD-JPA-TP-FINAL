package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class ExaminerEntity extends UserEntity{
    String login;
    String password;
    @ManyToOne
    private TestCenterEntity testCenter;
    @OneToMany
    @JoinColumn(name = "examiner_login")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;
}
