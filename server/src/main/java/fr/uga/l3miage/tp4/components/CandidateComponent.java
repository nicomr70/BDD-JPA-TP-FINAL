package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private final CandidateRepository candidateRepository;

    //CRUD
    public CandidateEntity getCandidate(long id){
        return candidateRepository.findById(id).orElseThrow();

    }

    public CandidateEntity createCandidate(CandidateEntity candidateEntity){
        return candidateRepository.save(candidateEntity);
    }

    public CandidateEntity updateCandidate(long id, CandidateEntity candidateEntity){
        CandidateEntity candidate = candidateRepository.findById(id).orElseThrow();
        candidate.setFirtName(candidateEntity.getFirtName());
        candidate.setLastName(candidateEntity.getLastName());
        candidate.setEmail(candidateEntity.getEmail());
        candidate.setPhoneNumber(candidateEntity.getPhoneNumber());
        candidate.setBirthDate(candidateEntity.getBirthDate());
        candidate.setHasExtraTime(candidateEntity.isHasExtraTime());
        return candidateRepository.save(candidate);
    }

    public void deleteCandidate(long id){
        candidateRepository.deleteById(id);
    }

    public Set<CandidateEntity> getAllCandidateGRE(){
        //récupérer tous les candidats et filtrer par la suite par code
        TestCenterCode gre = TestCenterCode.GRE;
        return candidateRepository.findAllByTestCenterEntity_Code(gre);
    }

    // Récupère tous les candidats éliminés.
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findAll().stream()// Récupère tous les candidats,
                .filter(candidate -> candidate.getCandidateEvaluationGridEntities().stream()
                        .anyMatch(grade -> grade.getGrade() <= 5))// filtre ceux ayant une note ≤ 5,
                .collect(Collectors.toSet()); // retourne le résultat sous forme de Set pour éliminer les doublons
    }


    // Récupère tous les candidats nés avant le 1er janvier 2000 et qui n'ont pas eu de temps additionnel.
    public Set<CandidateEntity> getCandidatesWithoutAdditionalTimeBefore1stJunuary2000(){
        LocalDate date = LocalDate.of(2000, 1, 1); // Définit la date limite.
        return candidateRepository.findAllByHasExtraTimeFalseAndBirthDateBefore(date);// Filtre par date de naissance et absence de temps additionnel.
    }


}
