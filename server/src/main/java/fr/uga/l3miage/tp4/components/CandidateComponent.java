package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import fr.uga.l3miage.tp4.repositories.CandidateEvaluationGridRepository;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {


    private final CandidateRepository candidateRepository;
    private final CandidateEvaluationGridRepository evaluationGridRepository;

    //R2
    public Set<CandidateEntity> findCandidatsByTestCenterCode_GR(){
        return candidateRepository.findAllByTestCenterEntityCode(TestCenterCode.GRE);
    }
    //R3
    public Set<CandidateEntity> findCandidatesWithAtLeastOneDisqualifyingGrade() {
        // Récupère toutes les évaluations éliminatoires
        Set<CandidateEvaluationGridEntity> disqualifyingEvaluations = evaluationGridRepository.findByGradeLessThanEqual(5);

        
        Set<CandidateEntity> candidatesWithDisqualifyingGrades = new HashSet<>();

        for (CandidateEvaluationGridEntity evaluation : disqualifyingEvaluations) {
            // Ajoute le candidat associé à chaque évaluation éliminatoire
            candidatesWithDisqualifyingGrades.add(evaluation.getCandidateEntity());
        }

        return candidatesWithDisqualifyingGrades;
    }
    //R4
    public Set<CandidateEntity> findCandidatesWithoutExtraTimeBornBefore2000() {
        // Définissez la date de référence pour le 01/01/2000
        LocalDate referenceDate = LocalDate.of(2000, 1, 1);
        // Utilisez la méthode du repository pour récupérer les candidats
        return candidateRepository.findByHasExtraTimeFalseAndBirthDateBefore(referenceDate);
    }

}
