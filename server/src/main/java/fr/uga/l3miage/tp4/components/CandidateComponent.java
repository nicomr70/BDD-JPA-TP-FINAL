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

    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findAllByGridEntitiesLessGradeThanEqual(5.00);
    }
    public Set<CandidateEntity> getAllCandidateAgedBefore2000(){
        return candidateRepository.findAllByHasExtraTimeFalseAndBirthDateBefore(LocalDate.of(2000,01,01).atStartOfDay());
    }


}
