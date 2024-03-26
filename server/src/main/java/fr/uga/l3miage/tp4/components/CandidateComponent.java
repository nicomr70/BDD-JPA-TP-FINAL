package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private final CandidateEntityRepository candidateEntityRepository;

    public Set<CandidateEntity> getCandidatesByTestCenterCodeGRE() {
        return candidateEntityRepository.findByTestCenterCode("GRE").stream()
                .collect(Collectors.toSet());
    }

    public Set<CandidateEntity> getAllEliminatedCandidates() {
        return candidateEntityRepository.findAll().stream()
                .filter(candidate -> 
                        candidate.getEvaluationGrids().stream()
                        .anyMatch(grid -> grid.getGrade() <= 5))
                .collect(Collectors.toSet());
    }

    public Set<CandidateEntity> getCandidatesWithoutExtraTimeBornBefore2000() {
        return candidateEntityRepository.findByHasExtraTimeFalseAndBirthDateBefore(LocalDate.of(2000, 1, 1)).stream()
                .collect(Collectors.toSet());
    }
}
