package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ExaminerEntity extends UserEntity{

    private String login;
    private String password;

    @ManyToOne
    private TestCenterEntity testCenter;

    @OneToMany
    @JoinColumn(name = "examiner_id")
    private Set<CandidateEvaluationGridEntity> evaluationGrids;


}
