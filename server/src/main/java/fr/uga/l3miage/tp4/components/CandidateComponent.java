package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private final CandidateRepository candidateRepository;

    public Set<CandidateEntity> getAllCandidateGRE(){
        return candidateRepository.findByTestCenterCode("GRE");
    }

    public Set<CandidateEntity> getAllEliminatedCandidate(){
        Set<CandidateEntity> listCandidatEliminer = candidateRepository.findAll()
                .stream().filter(candidate -> candidate.getCandidateEvaluationGridEntities().stream().anyMatch(grade -> grade.getGrade() <= 5))
                .collect(Collectors.toSet());

        return listCandidatEliminer;
    }

}
