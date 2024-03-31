package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.ExamEntity;
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

    public CandidateEntity getCandidate(long id){
        return candidateRepository.findById(id).orElseThrow();

    }

    public CandidateEntity createCandidate(CandidateEntity candidateEntity){
        return candidateRepository.save(candidateEntity);
    }

    public CandidateEntity updateCandidate(long id, CandidateEntity candidateEntity){
        CandidateEntity candidate = candidateRepository.findById(id).orElseThrow();
        candidate.setFirstname(candidateEntity.getFirstname());
        candidate.setLastname(candidateEntity.getLastname());
        candidate.setEmail(candidateEntity.getEmail());
        candidate.setPhoneNumber(candidateEntity.getPhoneNumber());
        candidate.setBirthDate(candidateEntity.getBirthDate());
        candidate.setHasExtraTime(candidateEntity.isHasExtraTime());
        return candidateRepository.save(candidate);
    }

    public void deleteCandidate(long id){
        candidateRepository.deleteById(id);
    }

    // Cette méthode récupère les candidats qui
    // n'ont pas de temps supplementaire et dont la date de naissance est avant le 01/01/2000
    public Set<CandidateEntity> getWithoutAdditionalBefore01012000(){
        LocalDate date = LocalDate.of(2000, 1, 1);
        return candidateRepository.findAllByHasExtraTimeFalseAndBirthDateBefore(date);
    }

    // Cette méthode récupère tous les candidats ayant passé le test avec le GRE
    public Set<CandidateEntity> getAllCandidateGRE(){
        TestCenterCode gre = TestCenterCode.GRE;
        return candidateRepository.findAllByTestCenterEntity_Code(gre);
    }

    // Cette méthode récupère tous les candidats éliminés, c'est-à-dire ceux
    // ayant obtenu une note inférieure ou égale à 5 dans l'évaluation
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findAll()
                .stream().filter(candidate -> candidate.getCandidateEvaluationGridEntities().stream().anyMatch(grade -> grade.getGrade() <= 5))
                .collect(Collectors.toSet());
    }

}
