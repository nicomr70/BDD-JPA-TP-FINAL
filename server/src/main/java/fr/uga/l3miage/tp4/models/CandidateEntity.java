package fr.uga.l3miage.tp4.models;


import org.apache.tomcat.jni.Local;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import java.time.LocalDate;

@Entity
public class CandidateEntity extends UserEntity {

    private LocalDate birthDate;

    private Boolean hasExtraTime;
}
