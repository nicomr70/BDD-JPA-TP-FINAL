package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;
@Entity
public class CandidateEntity extends UserEntity{
    private LocalDate birthDate;
    private boolean hasExtraTime;
    @OneToMany(mappedBy = "candidat")
    private Set<CandidateEvaluationGridEntity> gridEvaluation;

    @ManyToOne()
    private TestCenterEntity testCenterEntity;

    public double[] getCandidateEvaluationGrades() {
        return this.gridEvaluation.stream() // Transformer la collection en Stream
                .mapToDouble(CandidateEvaluationGridEntity::getGrade) // Convertir chaque Entity en double en utilisant getGrade
                .toArray(); // Convertir le Stream en tableau de double
    }
}
