package fr.uga.l3miage.tp4.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("CandidateEntity")
public class CandidateEntity extends UserEntity{
    private LocalDate birthDate;
    private boolean hasExtratime;



}
