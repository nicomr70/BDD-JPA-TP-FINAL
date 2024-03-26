package fr.uga.l3miage.tp4.components;

import lombok.RequiredArgsConstructor;

import java.util.Set;

import org.springframework.stereotype.Component;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateEvaluationGridRepository;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
    private final CandidateRepository candidateRepository;
    private final CandidateEvaluationGridRepository candidateEvaluationGridRepository;

    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateEvaluationGridRepository.findAllByGradeLessThan(5);
    }

}
