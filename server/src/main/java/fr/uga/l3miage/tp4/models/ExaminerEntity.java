package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Getter
@Setter
@Entity
public class ExaminerEntity extends UserEntity {

    @Column(length = 6)
    private String login;
    private String password;

    @ManyToOne
    private TestCenterEntity testCenterEntity;

    @OneToMany(mappedBy = "examinerEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

}
