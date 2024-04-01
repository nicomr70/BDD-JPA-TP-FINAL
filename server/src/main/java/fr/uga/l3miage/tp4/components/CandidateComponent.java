package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.repositories.CandidateEvaluationGridRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    /* TODO à implémenter
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return null;
    }
    */
    CandidateEvaluationGridRepository candidateEvaluationGridRepository;



}
