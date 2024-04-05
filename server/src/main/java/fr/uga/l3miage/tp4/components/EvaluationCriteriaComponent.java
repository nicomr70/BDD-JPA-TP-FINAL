package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.EvaluationCriteriaEntity;
import fr.uga.l3miage.tp4.repositories.EvaluationCriteriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EvaluationCriteriaComponent {
    private final EvaluationCriteriaRepository evaluationCriteriaRepository;

    public EvaluationCriteriaEntity getEvaluationCriteria(Long id){ // récupérer EvaluationCriteria par son id
        return evaluationCriteriaRepository.findById(id).orElseThrow();
    }


    // Create
    public  EvaluationCriteriaEntity createEvaluationCriteriaEntity(){
        EvaluationCriteriaEntity evaluationCriteriaEntity = EvaluationCriteriaEntity
                .builder()
                .id(1L)
                .description("description par défaut")
                .hasCandidatePerformedCriteria(true)
                .build();
        return evaluationCriteriaRepository.save(evaluationCriteriaEntity);
    }


    // Update de description
    public EvaluationCriteriaEntity updateDescription(Long id,String newDescription){
        EvaluationCriteriaEntity evaluationCriteriaEntity = evaluationCriteriaRepository.findById(id).orElseThrow();
        evaluationCriteriaEntity.setDescription(newDescription);
        return evaluationCriteriaRepository.save(evaluationCriteriaEntity);
    }

    //Update du boolean
    public EvaluationCriteriaEntity updateHasCandidatePerformedCriteria(Long id,boolean newHasCandidatePerformedCriteria){
        EvaluationCriteriaEntity evaluationCriteriaEntity = evaluationCriteriaRepository.findById(id).orElseThrow();
        evaluationCriteriaEntity.setHasCandidatePerformedCriteria(newHasCandidatePerformedCriteria);
        return evaluationCriteriaRepository.save(evaluationCriteriaEntity);
    }

    //Drop
    public void deleteEvaluationCriteriaEntity(Long id){
        evaluationCriteriaRepository.deleteById(id);
    }


}
