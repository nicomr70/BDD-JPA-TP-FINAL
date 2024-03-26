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

    /* TODO à implémenter
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return null;
    }
    */
    private final CandidateRepository candidateRepository;
    public Set<CandidateEntity> getCandidatesWithNoExtraTime(LocalDate dateNaissance){
        return candidateRepository.findAllByHasExtraTimeFalseAndBirthDateBefore(dateNaissance);
    }

}
