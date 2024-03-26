package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
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

    public CandidateEntity getCandidate(Long id){
        return candidateRepository.findById(id).orElseThrow();

    }

    public CandidateEntity createCandidate(CandidateEntity candidateEntity){
        return candidateRepository.save(candidateEntity);
    }

    public CandidateEntity updateCandidate(Long id, CandidateEntity candidateEntity){
        CandidateEntity ancien = candidateRepository.findById(id).orElseThrow();
        ancien.setFirstname(candidateEntity.getFirstname());
        ancien.setLastname(candidateEntity.getLastname());
        ancien.setEmail(candidateEntity.getEmail());
        ancien.setPhoneNumber(candidateEntity.getPhoneNumber());
        ancien.setBirthDate(candidateEntity.getBirthDate());
        ancien.setHasExtraTime(candidateEntity.isHasExtraTime());
        return candidateRepository.save(ancien);

    }

    public void deleteCandidate(Long id){
        candidateRepository.deleteById(id);
    }


    // recupère tous les candidats qui ont au dessus de 5
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findByCandidateEvaluationGridEntitiesGradeLessThanEqual(5);
    }

    // recupère tous les candidats qui ont le TesterCenterCode GRE
    public Set<CandidateEntity> getCandidatesByTestCenterCode(){
        return candidateRepository.findByTestCenterEntityCode(TestCenterCode.GRE);
    }

    // recupere tous les candidats qui sont nées avant 2000
    public Set<CandidateEntity> getCandidatesWithoutExtraTimeAndBirth(){
        return candidateRepository.findByHasExtraTimeFalseAndBirthDateBefore(LocalDate.of(2000,1,1));
    }


}
