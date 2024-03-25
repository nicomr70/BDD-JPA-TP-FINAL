package fr.uga.l3miage.tp4.models;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDate;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue("C")
public class CandidateEntity extends  UserEntity{

    private LocalDate birthDate;

    private boolean HasExtraTime;
}
