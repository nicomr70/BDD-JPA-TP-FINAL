package fr.uga.l3miage.tp4.components;

import lombok.RequiredArgsConstructor;

import java.util.Set;

import org.springframework.stereotype.Component;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
    private final CandidateRepository candidateRepository;
   
    public Set<CandidateEntity> getAllEliminatedCandidate(Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities){
        return candidateRepository.findAllByGrade(candidateEvaluationGridEntities);
    }
    

}
