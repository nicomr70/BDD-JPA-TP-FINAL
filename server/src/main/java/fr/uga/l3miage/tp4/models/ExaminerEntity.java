package fr.uga.l3miage.tp4.models;

import org.apache.tomcat.jni.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class ExaminerEntity extends UserEntity {
    private String login;
    private String password;

    @OneToMany(mappedBy = "examiner")
    private Set<CandidateEvaluationGridEntity> CandidateEvaluationGrids;

    @ManyToOne
    private TestCenterEntity testCenter;
}
