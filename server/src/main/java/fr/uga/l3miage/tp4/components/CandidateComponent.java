package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
    private CandidateRepository candidateRepository;
    public Set<CandidateEntity> getAllEliminatedCandidate() {
        return candidateRepository.findAll().stream()
                .filter(candidateEntity -> candidateEntity.getGridEvaluation().stream()
                        .anyMatch(candidateEvaluationGridEntity -> candidateEvaluationGridEntity.getGrade() <= 5))
                .collect(Collectors.toSet());
    }

    public Set<CandidateEntity> getAllMillenialsCandidateWithoutAddingTime(){
        Set<CandidateEntity> cand = candidateRepository.findByBirthDate(LocalDate.of(2000, 1, 1));
        return cand.stream()
                .filter(candidateEntity -> !candidateEntity.isHasExtraTime())
                .collect(Collectors.toSet());
    }
}
