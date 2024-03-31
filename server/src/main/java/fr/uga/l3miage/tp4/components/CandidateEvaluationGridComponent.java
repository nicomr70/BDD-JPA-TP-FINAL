package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import fr.uga.l3miage.tp4.repositories.CandidateEvaluationGridRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CandidateEvaluationGridComponent {

    private final CandidateEvaluationGridRepository candidateEvaluationGridRepository ;

    public CandidateEvaluationGridEntity getCandidateEvaluationGrid(Long id){
        return candidateEvaluationGridRepository.findById(id).orElseThrow();
    }

    public CandidateEvaluationGridEntity createCandidateEvaluationGrid(CandidateEvaluationGridEntity candidateEvaluationGrid){
        return candidateEvaluationGridRepository.save(candidateEvaluationGrid);
    }

    public CandidateEvaluationGridEntity updateCandidateEvaluationGrid(Long id, CandidateEvaluationGridEntity candidateEvaluationGridEntity){
        CandidateEvaluationGridEntity ancien = candidateEvaluationGridRepository.findById(id).orElseThrow();
        ancien.setSheetNumber(candidateEvaluationGridEntity.getSheetNumber());
        ancien.setGrade(candidateEvaluationGridEntity.getGrade());
        ancien.setSubmissionDate(candidateEvaluationGridEntity.getSubmissionDate());
        return candidateEvaluationGridRepository.save(ancien);
    }

    public void deleteCandidateEvaluationGrid(Long id){
        candidateEvaluationGridRepository.deleteById(id);
    }

}
