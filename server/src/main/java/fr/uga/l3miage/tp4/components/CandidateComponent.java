package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private CandidateRepository candidateRepository;
    /* TODO à implémenter
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return null;
    }
    */

}
