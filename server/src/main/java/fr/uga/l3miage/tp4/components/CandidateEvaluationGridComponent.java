package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.entities.CandidateEvaluationGridEntity;
import fr.uga.l3miage.tp4.repositories.CandidateEvaluationGridRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CandidateEvaluationGridComponent {
    private final CandidateEvaluationGridRepository candidateEvaluationGridRepository;

    public CandidateEvaluationGridEntity getCandidateEvaluationGrid(Long sheetNumber){
        return candidateEvaluationGridRepository.findById(sheetNumber).orElseThrow();
    }
    public CandidateEvaluationGridEntity createCandidateEvaluationGrid(CandidateEvaluationGridEntity candidateEvaluationGridEntity){
        return candidateEvaluationGridRepository.save(candidateEvaluationGridEntity);
    }

    public void deleteCandidateEvaluationGrid(Long sheetNumber){
        candidateEvaluationGridRepository.deleteById(sheetNumber);
    }

    public CandidateEvaluationGridEntity updateGrade(Long sheetNumber, Double newGrade){
        CandidateEvaluationGridEntity candidateEvaluationGridEntity = candidateEvaluationGridRepository.findById(sheetNumber).orElseThrow();
        candidateEvaluationGridEntity.setGrade(newGrade);
        return candidateEvaluationGridRepository.save(candidateEvaluationGridEntity);
    }
}
