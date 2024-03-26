package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.models.ExaminerEntity;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;


@Component
@RequiredArgsConstructor
public class ExamComponent {

    private final ExamRepository examRepository;


    public ExamEntity getEcosSessionProgrammation(Long id){
        return examRepository.findById(id).orElseThrow();

    }

    public ExamEntity createEcosSessionProgrammation(ExamEntity examEntity){
        return examRepository.save(examEntity);
    }

    public ExamEntity updateEcosSessionProgrammation(Long id, ExamEntity examEntity){
        ExamEntity ancien = examRepository.findById(id).orElseThrow();
        ancien.setStartDate(examEntity.getStartDate());
        ancien.setEndDate(examEntity.getEndDate());
        ancien.setName(examEntity.getName());
        ancien.setWeight(examEntity.getWeight());
        return examRepository.save(ancien);
    }

    public void deleteEcosSessionProgrammation(Long id){
        examRepository.deleteById(id);
    }
    public Set<ExamEntity> getAllCardioExam(){
        return examRepository.findDistinctBySkillEntitiesNameContainingIgnoreCase("cardio");
    }




}
