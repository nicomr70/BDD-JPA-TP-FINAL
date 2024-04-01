package fr.uga.l3miage.tp4.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor

public class CandidateEntity extends  UserEntity {
private LocalDate birthDate;
private boolean hasExtraTime;

@OneToMany(mappedBy = "Candidate") // La liste des grilles d'evaluations du Candidate
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;
@ManyToOne // Le centre de test que le Candidat appartient
    private TestCenterEntity testCenter;
}
