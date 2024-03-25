package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import org.apache.tomcat.jni.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
public class CandidateEntity extends UserEntity {
    private LocalDate birthDate;
    private boolean hasExtraTime;

    @OneToMany(mappedBy = "candidateEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToOne
    private TestCenterEntity testCenterEntity;
}
