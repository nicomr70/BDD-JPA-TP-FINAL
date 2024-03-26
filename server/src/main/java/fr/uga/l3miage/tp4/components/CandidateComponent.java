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

    public final CandidateRepository candidateRepository;

    public Set<CandidateEntity> getCandidatesHaveCodeGre() {
        return candidateRepository.findAllByTestCenterEntity_Code(TestCenterCode.GRE);
    }


    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findByCandidateEvaluationGridEntitiesGradeLessThanEqual(5.0);
    }


    public Set<CandidateEntity> getAllCandidatesHasExtraTime(){
        return candidateRepository.findAllByHasExtraTimeFalseAndBirthDateBefore(LocalDate.of(01,01,2000));
    }



}
