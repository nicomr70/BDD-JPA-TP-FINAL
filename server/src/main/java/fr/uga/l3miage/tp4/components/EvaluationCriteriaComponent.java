package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.entities.EvaluationCriteriaEntity;
import fr.uga.l3miage.tp4.repositories.EvaluationCriteriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EvaluationCriteriaComponent {
    private final EvaluationCriteriaRepository evaluationCriteriaRepository;

    public EvaluationCriteriaEntity getEvaluationCriteria(Long id){
        return evaluationCriteriaRepository.findById(id).orElseThrow();
    }

    public EvaluationCriteriaEntity createEvaluationCriteria(EvaluationCriteriaEntity evaluationCriteriaEntity){
        return evaluationCriteriaRepository.save(evaluationCriteriaEntity);
    }

    public void deleteEvaluationCriteria(Long id){
        evaluationCriteriaRepository.deleteById(id);
    }

    public EvaluationCriteriaEntity updateDescription(Long id, String newDesc){
        EvaluationCriteriaEntity evaluationCriteriaEntity=evaluationCriteriaRepository.findById(id).orElseThrow();
        evaluationCriteriaEntity.setDescription(newDesc);
        return evaluationCriteriaRepository.save(evaluationCriteriaEntity);
    }
}
