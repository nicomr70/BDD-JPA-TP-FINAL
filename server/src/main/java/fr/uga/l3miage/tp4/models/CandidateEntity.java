package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class CandidateEntity extends UserEntity {
    LocalDate birthDate;
    boolean hasExtraTime;

    @ManyToOne
    TestCenterEntity testCenter;
}
