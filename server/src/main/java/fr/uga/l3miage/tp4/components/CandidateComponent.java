package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import fr.uga.l3miage.tp4.repositories.TestCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private CandidateRepository candidateRepository;

    public Set<CandidateEntity> getCandidatesByTestCenterCodeGRE() {
        return candidateRepository.findByTestCenterCode("GRE");
    }

    public Set<CandidateEntity> getCandidatesWithEliminatoryGrade() {
        return candidateRepository.findByGradesValueLessThanEqual(5.0);
    }

    public Set<CandidateEntity> getCandidatesWithoutExtraTimeAndBornBefore2000() {
        return candidateRepository.findByHasExtraTimeFalseAndBirthDateBefore(LocalDate.of(2000, 1, 1));
    }
}
