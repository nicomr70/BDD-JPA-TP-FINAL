package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
    private final CandidateRepository candidateRepository;

    public CandidateComponent(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public Set<CandidateEntity> getCandidatesWithFailingGrades() {
        return candidateRepository.findByCandidateEvaluationGridEntitiesGradeLessThanEqual(5.0);
    }

    /* TODO à implémenter
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return null;
    }
    */

}
