package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import fr.uga.l3miage.tp4.repositories.CandidateEvaluationGridRepository;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import fr.uga.l3miage.tp4.repositories.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
    private final CandidateRepository candidateRepository;

    private final CandidateEvaluationGridRepository candidateEvaluationGridRepository;
    // TODO à implémenter
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findAllByaPourGrillesEvaluationsContaining(candidateEvaluationGridRepository.findAllByGradeIsLessThan(5.0));
    }

}
