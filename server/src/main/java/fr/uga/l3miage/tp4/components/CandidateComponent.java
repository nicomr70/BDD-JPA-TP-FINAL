package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private final CandidateRepository candidateRepository;

    // Récupérer les candidats qui ont eu au moins 1 note éliminatoire (<=5)
    public Set<CandidateEntity> getAllEliminatedCandidates() {
        return candidateRepository.findAllByGradeLessThanEqual(5.0);
    }

    // Récupérer les candidats qui n'ont pas de temps additionnel et qui sont nés avant le 01/01/2000
    public Set<CandidateEntity> getAllCandidatesWithoutExtraTimeAndBornBefore() {
        LocalDate dateOfBirth = LocalDate.of(2000, 1, 1);
        return candidateRepository.findAllByHasExtraTimeFalseAndBirthDateBefore(dateOfBirth);
    }
}

