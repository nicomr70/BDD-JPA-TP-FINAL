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
import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {


    private final CandidateRepository candidateRepository;
    private final CandidateEvaluationGridRepository evaluationGridRepository;


    public Set<CandidateEntity> findCandidatsbyTestCenterCode_GR(){
        return candidateRepository.findAllByTestCenterEntityCode(TestCenterCode.GRE);
    }

    public Set<CandidateEntity> findCandidatesWithAtLeastOneDisqualifyingGrade() {
        // Récupère toutes les évaluations éliminatoires
        Set<CandidateEvaluationGridEntity> disqualifyingEvaluations = evaluationGridRepository.findByGradeLessThanEqual(5);

        // Utilise un Set pour éviter les doublons de candidats
        Set<CandidateEntity> candidatesWithDisqualifyingGrades = new HashSet<>();

        for (CandidateEvaluationGridEntity evaluation : disqualifyingEvaluations) {
            // Ajoute le candidat associé à chaque évaluation éliminatoire
            candidatesWithDisqualifyingGrades.add(evaluation.getCandidateEntity());
        }

        return candidatesWithDisqualifyingGrades;
    }

}
