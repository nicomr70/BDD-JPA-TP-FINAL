package fr.uga.l3miage.tp4.components;


import fr.uga.l3miage.tp4.models.EvaluationCriteriaEntity;
import fr.uga.l3miage.tp4.repositories.EvaluationCriteriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EvaluationCriteriaComponent {

    private final EvaluationCriteriaRepository evaluationCriteriaRepository;

    public EvaluationCriteriaEntity getEcosSessionProgrammation(Long id){
        return evaluationCriteriaRepository.findById(id).orElseThrow();

    }

    public EvaluationCriteriaEntity createEcosSessionProgrammation(EvaluationCriteriaEntity evaluationCriteriaEntity){
        return evaluationCriteriaRepository.save(evaluationCriteriaEntity);
    }

    public EvaluationCriteriaEntity updateEcosSessionProgrammation(Long id, EvaluationCriteriaEntity evaluationCriteriaEntity){
        EvaluationCriteriaEntity ancien = evaluationCriteriaRepository.findById(id).orElseThrow();
        ancien.setDescription(evaluationCriteriaEntity.getDescription());
        ancien.setHasCandidatePerformedCriteria(evaluationCriteriaEntity.isHasCandidatePerformedCriteria());
        return evaluationCriteriaRepository.save(ancien);
    }

    public void deleteEcosSessionProgrammation(Long id){
        evaluationCriteriaRepository.deleteById(id);
    }
}