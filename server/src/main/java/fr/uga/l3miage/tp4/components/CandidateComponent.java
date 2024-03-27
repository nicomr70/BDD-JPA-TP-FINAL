package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositorys.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
    private final CandidateRepository candidateRepository;


    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findAllByGradeLessThanEqual(5.00);
    }

    public  Set<CandidateEntity> getAllCandidateBirthDateBefore(){
        return candidateRepository.findAllByHasExtraTimeFalseAndBirthDateBefore(LocalDate.of(2000, 1, 1));
    }


}
