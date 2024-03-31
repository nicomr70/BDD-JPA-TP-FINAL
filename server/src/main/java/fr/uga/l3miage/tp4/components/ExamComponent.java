package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


@Component
@RequiredArgsConstructor
public class ExamComponent {
    private final ExamRepository examRepository;

    //Méthode CRUD
    public ExamEntity getExam(Long id){
        return examRepository.findById(id).orElseThrow();
    }

    public ExamEntity createCandidate(ExamEntity examEntity){
        return examRepository.save(examEntity);
    }

    public void deleteCandidate(Long id){
        examRepository.deleteById(id);
    }

    public ExamEntity updateCandidate(Long id, ExamEntity examEntity){
        ExamEntity ancien = examRepository.findById(id).orElseThrow();
        ancien.setName(examEntity.getName());
        ancien.setWeight(examEntity.getWeight());
        ancien.setEndDate(examEntity.getEndDate());
        ancien.setStartDate(examEntity.getStartDate());
        ancien.setEcosSessionEntity(examEntity.getEcosSessionEntity());
        return examRepository.save(ancien);

    }

    public Set<ExamEntity> getAllCardioExam(){
        //récupérer tous les examens et filtrer par la suite
        return examRepository.findAll().stream()
                .filter(exam -> exam.getSkillEntities().stream()
                        .anyMatch(skill -> skill.getName().contains("cardio")))
                .collect(Collectors.toSet());
    }
}
