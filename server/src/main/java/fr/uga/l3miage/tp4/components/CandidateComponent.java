package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
    private CandidateRepository candidateRepository;
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findAll().stream()
                .filter(candidate -> Arrays.stream(candidate.getCandidateEvaluationGrades())
                        .anyMatch(grade -> grade <= 5))
                .collect(Collectors.toSet());
    }


}
