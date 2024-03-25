package fr.uga.l3miage.tp4.models;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("C") // C pour Candidate
public class CandidateEntity extends  UserEntity{

    private LocalDate birthDate;

    private boolean HasExtraTime;

    @ManyToOne()
    private TestCenterEntity testCenter;
}
