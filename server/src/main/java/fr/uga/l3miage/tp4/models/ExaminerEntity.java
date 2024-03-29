package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class ExaminerEntity extends UserEntity{

    private String login;

    private String password;


    @OneToMany
    @JoinColumn(
            name = "sheet_id"
    )
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToOne
    private TestCenterEntity testCenterEntity;
}
