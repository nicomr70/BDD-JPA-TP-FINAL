package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class CandidateEvaluationGridEntity extends UserEntity {
    private LocalDate birthDate;
    private boolean hasExtraTime;
}
