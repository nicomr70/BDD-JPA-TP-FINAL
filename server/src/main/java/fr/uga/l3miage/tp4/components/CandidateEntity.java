package fr.uga.l3miage.tp4.components;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Entity
public class CandidateEntity extends UserEntity {
    private LocalDate birthDate;
    private boolean hasExtraTime;

    @ManyToMany(mappedBy = "candidate")
    private Set<TestCenterEntity> testCenters;
}
