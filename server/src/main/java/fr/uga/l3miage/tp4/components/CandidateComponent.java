package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
    private final CandidateRepository candidateRepository;

    public CandidateEntity getCandidateEntity(LocalDate birthDate){ // récupérer par son id
        return candidateRepository.findById(birthDate).orElseThrow();
    }

    // Create
    public CandidateEntity createCandidateEntity(){
        CandidateEntity candidateEntity = CandidateEntity
                .builder()
                .birthDate(LocalDate.now())
                .hasExtraTime(true)
                .build();
        return candidateRepository.save(candidateEntity);
    }

    // Update de boolean
    public CandidateEntity updateStartDate(LocalDate birthDay,boolean newHasExtraTime){
        CandidateEntity candidateEntity = candidateRepository.findById(birthDay).orElseThrow();
        candidateEntity.setHasExtraTime(newHasExtraTime);
        return candidateRepository.save(candidateEntity);
    }


    //Drop
    public void deleteCandidateEntity(LocalDate birthDate){
        candidateRepository.deleteById(birthDate);
    }


    // Récupérer les candidats qui ont eu au moins 1 note éliminatoire (<=5) (fonction nommée + CandidateComponent)

    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findByExamScore(5);
    }

    //Récupérer les candidats qui n'ont pas de temps additionnel et qui sont nés avant le 01/01/2000(fonction nommée)
    public Set<CandidateEntity> getAllWithoutExtraTimeWithBirthDay(){
        return candidateRepository.findByExtraTime(LocalDate.of(2000, 1, 1));
    }



}
