package fr.uga.l3miage.tp4.components;


import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import fr.uga.l3miage.tp4.repositories.CandidateEvaluationGridRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class CandidateEvaluationGridComponent {
    private final CandidateEvaluationGridRepository candidateEvaluationGridRepository;

    public  CandidateEvaluationGridEntity  getEvaluationCriteriaEntity(Long id){ // récupérer EvaluationCriteria par son id
        return candidateEvaluationGridRepository.findById(id).orElseThrow();
    }

    // Create
    public  CandidateEvaluationGridEntity createCandidateEvaluationGridEntity(){
        CandidateEvaluationGridEntity candidateEvaluationGridEntity = CandidateEvaluationGridEntity
                .builder()
                .sheetNumber(1L)
                .grade(20.0)
                .submissionDate(LocalDateTime.of(24,3,26,21,39,50))
                .build();
        return candidateEvaluationGridRepository.save(candidateEvaluationGridEntity);
    }

    // Update de Grade
    public CandidateEvaluationGridEntity updateGrade(Long sheetNumber,double newGrade){
        CandidateEvaluationGridEntity candidateEvaluationGridEntity = candidateEvaluationGridRepository.findById(sheetNumber).orElseThrow();
        candidateEvaluationGridEntity.setGrade(newGrade);
        return candidateEvaluationGridRepository.save(candidateEvaluationGridEntity);
    }

    // Update de submissionDate

    public CandidateEvaluationGridEntity updateGrade(Long sheetNumber,LocalDateTime newSubmissionDate){
        CandidateEvaluationGridEntity candidateEvaluationGridEntity = candidateEvaluationGridRepository.findById(sheetNumber).orElseThrow();
        candidateEvaluationGridEntity.setSubmissionDate(newSubmissionDate);
        return candidateEvaluationGridRepository.save(candidateEvaluationGridEntity);
    }


    //Drop
    public void deleteCandidateEvaluationGridEntity(Long sheetNumber){
        candidateEvaluationGridRepository.deleteById(sheetNumber);
    }
}
