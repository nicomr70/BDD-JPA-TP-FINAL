package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

import lombok.Data;

@Entity
@Data
public class ExaminerEntity extends UserEntity{

    private String login;
    private String password;

    @ManyToOne
    private TestCenterEntity testCenterEntity;

    @OneToMany
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

}