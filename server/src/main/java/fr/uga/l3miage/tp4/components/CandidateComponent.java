package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import fr.uga.l3miage.tp4.repositories.TestCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private final CandidateRepository candidateRepository;


    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findByCandidateEvaluationGrids_GradeLessThanEqual(5);
    }

}
