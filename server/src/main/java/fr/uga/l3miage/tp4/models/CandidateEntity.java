package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class CandidateEntity extends UserEntity {
    private LocalDate birthDate;
    private boolean hasExtraTime;
    @ManyToOne
    private TestCenterEntity testCenter;
}
