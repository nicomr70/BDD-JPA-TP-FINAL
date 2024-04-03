package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class ExaminerEntity extends UserEntity {
    @Column(length = 6)
    String login;
    String password;
    @ManyToOne
    TestCenterEntity testCenter;

    @OneToMany(mappedBy = "examiner")
    Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;
}
