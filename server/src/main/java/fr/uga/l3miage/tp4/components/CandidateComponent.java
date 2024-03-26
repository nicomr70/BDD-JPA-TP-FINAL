package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.awt.event.ComponentAdapter;
import java.time.LocalDate;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private final CandidateRepository candidateRepository;

    /*public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findAllByGradeLessThanEqual(5.0);
    }*/

    // c'est pas demandé explicitement
    public Set<CandidateEntity> getAllCandidatesWithCodeGRE(){
        return candidateRepository.findAllByTestCenterCode("GRE");
    }

    // c'est pas demandé explicitement
    public Set<CandidateEntity> getAllCandidatesBornBefore2000AndHaveExtraTime(){
        return candidateRepository.findAllByHasExtraTimeFalseAndBirthDateBefore(LocalDate.parse("01/01/2000"));
    }


}
