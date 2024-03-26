package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.entities.CandidateEntity;
import fr.uga.l3miage.tp4.entities.ExamEntity;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;


@Component
@RequiredArgsConstructor
public class ExamComponent {
    private final ExamRepository examRepository;

    public ExamEntity getExam(Long id){
        return examRepository.findById(id).orElseThrow();
    }

    public ExamEntity createExam(ExamEntity examEntity){
        return examRepository.save(examEntity);
    }

    public void deleteExam(Long id){
        examRepository.deleteById(id);
    }

    public ExamEntity updateWeight(Long id, Integer newWeight){
        ExamEntity examEntity = examRepository.findById(id).orElseThrow();
        examEntity.setWeight(newWeight);
        return examRepository.save(examEntity);
    }

    public Set<ExamEntity> getAllCardioExam(){
        return examRepository.findBySkillEntities_NameContaining("Cardio");
    }


}
