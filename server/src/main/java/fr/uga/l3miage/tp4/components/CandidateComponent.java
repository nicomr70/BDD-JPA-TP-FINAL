package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;

import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private CandidateRepository candidateRepository;

    /*avant le 01/01/2000 */
    public Set<CandidateEntity> getAllWithoutExtraTimeWithBirthDay(){
        return candidateRepository.findByHasExtraTimeFalseAndBirthDateBefore(LocalDate.of(2000, 1, 1));
    }




}
