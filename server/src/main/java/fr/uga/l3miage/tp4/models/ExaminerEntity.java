package fr.uga.l3miage.tp4.models;

import javax.persistence.OneToMany;
import java.util.Set;

public class ExaminerEntity extends UserEntity{
    private String login;
    private String password;
    @OneToMany
    private Set<CandidateEvaluationGridEntity> gridsEvaluation;
}
