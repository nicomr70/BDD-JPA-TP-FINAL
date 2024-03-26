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

    public Set<CandidateEntity> getWithoutAdditionalBefore01012000(){
        LocalDate date = LocalDate.of(2000, 1, 1);
        return candidateRepository.findAllByHasExtraTimeFalseAndBirthDateBefore(date);
    }


    public Set<CandidateEntity> getAllCandidateGRE(){
        TestCenterCode gre = TestCenterCode.GRE;
        return candidateRepository.findAllByTestCenterEntity_Code(gre);
    }

    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findAll()
                .stream().filter(candidate -> candidate.getCandidateEvaluationGridEntities().stream().anyMatch(grade -> grade.getGrade() <= 5))
                .collect(Collectors.toSet());
    }

}
