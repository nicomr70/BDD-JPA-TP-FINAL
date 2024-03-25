package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.EcosSessionProgrammationEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private final CandidateRepository candidateRepository;


    public Set<CandidateEntity> getAllGreCandidate() {
        return candidateRepository.findByTestCenter_Code("GRE");
    }


    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findAll().stream().filter(this::hasEliminatoryGrade).collect(Collectors.toSet());
    }

    //Renvoie vrai si le candidat a au moins une note éliminatoire, false sinon.
    private boolean hasEliminatoryGrade(CandidateEntity candidate) {
        return candidate.getCandidateEvaluationGridEntities().stream()
                .anyMatch(grid -> grid.getGrade() <= 5);
    }


}
