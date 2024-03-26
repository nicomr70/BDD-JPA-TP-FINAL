package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {


    public Set<CandidateEntity> getAllEliminatedCandidate(CandidateEvaluationGridEntity candidateEval, Double badGrade){

        Set<CandidateEntity> eliminatedCandidates = new HashSet<>();

        if (candidateEval != null) {
            if (candidateEval.getGrade() <= badGrade) {
                eliminatedCandidates.add(candidateEval.getCandidate());
                return eliminatedCandidates;
            }
        }
        return null;

    }


}
