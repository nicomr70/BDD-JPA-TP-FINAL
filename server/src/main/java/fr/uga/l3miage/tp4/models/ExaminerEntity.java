package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ExaminerEntity extends  UserEntity {
    @Column(length = 6)
    private String login;

    private String password;

    @ManyToOne
    private TestCenterEntity testCenter;

//    @OneToMany
//    @JoinColumn(name="id_examiner", referencedColumnName = "id")
//    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;


}
