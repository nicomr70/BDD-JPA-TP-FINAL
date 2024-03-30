package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ExaminerEntity extends UserEntity{
    @Id
    @Column(length = 6)
    private String login;
    private String password;

    @ManyToOne
    @JoinColumn(name = "test_center_id")
    private TestCenterEntity testCenterEntity;

    @OneToMany
    @JoinColumn(name = "sheet_number", referencedColumnName = "id")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}
