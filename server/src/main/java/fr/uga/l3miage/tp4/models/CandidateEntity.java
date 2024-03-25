package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;
@Getter
@Setter
@Entity
public class CandidateEntity extends UserEntity{

    private LocalDate birthDate;
    private boolean hasExtraTime;
}
