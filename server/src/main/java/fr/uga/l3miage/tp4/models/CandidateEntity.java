package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
public class CandidateEntity extends UserEntity{

    private LocalDate birthDate;
    private boolean hasExtraTime;

}
