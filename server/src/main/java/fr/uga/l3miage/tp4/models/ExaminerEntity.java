package fr.uga.l3miage.tp4.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.*;
import java.util.Set;

@Entity
public class ExaminerEntity extends UserEntity {

    private String login;

    @Column(length=6)
    private String password;

    @ManyToOne
    private TestCenterEntity testCenter;


    //unidirectionnelle donc pas utilisation de "mappedBy"
    @OneToMany
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;

}
