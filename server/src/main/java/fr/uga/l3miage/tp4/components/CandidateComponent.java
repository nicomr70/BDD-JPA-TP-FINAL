package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
private  final CandidateRepository candidateRepository;

    /* TODO à implémenter
    public Set<CandidateEntity> getAllEliminatedCandidate(){

    }
    */

    public Set<CandidateEntity> getCandidatsPasDeTempsAddNesAvant(LocalDateTime birthDate){
        // 4) Récupérer les candidats qui n'ont pas de temps additionnel et qui sont nés avant le 01/01/2000
        return candidateRepository.findAllByHasExtraTimeIsFalseAndBirthDateBefore(LocalDateTime.parse("01-01-2000"));
    }

}
