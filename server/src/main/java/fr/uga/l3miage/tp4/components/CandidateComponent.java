package fr.uga.l3miage.tp4.components;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    CandidateEvaluationGridRepository candidateEvaluationGridRepository;

    public Set<CandidateEntity> getAllEliminatedCandidates() {
        Set<CandidateEvaluationGridEntity> evaluationGridEntities = candidateEvaluationGridRepository.findAllByGradeLessThanEqual(5.00);
        Set<CandidateEntity> candidates = new HashSet<>();
        for (CandidateEvaluationGridEntity grid : evaluationGridEntities) {
            //candidates.add(grid.candidate());
        }
        return candidates;
    }

}
