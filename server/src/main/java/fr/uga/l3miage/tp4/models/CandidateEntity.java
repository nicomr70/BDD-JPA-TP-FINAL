package fr.uga.l3miage.tp4.models;


import org.apache.tomcat.jni.Local;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class CandidateEntity extends UserEntity {

    private LocalDate birthDate;

    private Boolean hasExtraTime;

    @OneToMany(mappedBy = "candidate")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;

    @ManyToOne
    private TestCenterEntity testCenter;
}
