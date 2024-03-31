package fr.uga.l3miage.tp4.models;

import org.apache.tomcat.jni.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class CandidateEntity extends UserEntity {
    private LocalDate birthDate;
    private Boolean hasExtraTime;

    @OneToMany(mappedBy = "candidate")
    private Set<CandidateEvaluationGridEntity> EvaluationGrids;

    @ManyToOne
    private TestCenterEntity testCenter;
}
