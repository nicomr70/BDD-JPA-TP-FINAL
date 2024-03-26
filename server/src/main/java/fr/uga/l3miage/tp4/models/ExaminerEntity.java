package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

import java.util.Set;

@Entity
public class ExaminerEntity extends UserEntity {
    @Column(length = 6)
    private String login;
    
    private String password;

    @ManyToOne
    TestCenterEntity testCenterEntity;

    @OneToMany // Unidirect donc pas de mappedBy
    Set<CandidateEvaluationGridEntity> candidateEvaluationEntities;
}
