package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import fr.uga.l3miage.tp4.repositories.CandidateEvaluationGridRepository;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private final CandidateEvaluationGridRepository candidateEvaluationGridRepository;
    private final CandidateRepository candidateRepository;
    public Set<CandidateEvaluationGridEntity> getAllEliminatedCandidate(){
        return candidateEvaluationGridRepository.findAllByGradeIsLessThan(5);
    }

}
