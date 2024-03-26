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

    public Set<CandidateEntity> getCandidateAtGre(){
        return candidateRepository.findCandidateEntitiesByTestCenterCode(TestCenterCode.GRE);
    }
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findByEvaluationGridsGradeLessThan(5.0);
    }
    public Set<CandidateEntity> getCandidateWithNoExtraTimeBornBefore2000(){
        return candidateRepository.findByHasExtraTimeFalseAndBirthDateBefore(LocalDate.ofEpochDay(2000-01-01));
    }
}