package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;


@Component
@RequiredArgsConstructor
public class ExamComponent {
    private final ExamRepository examRepository;
    public Set<ExamEntity> getAllCardioExam(){
        return examRepository.findAllBySkillEntitiesNameContainingAndNameContaining("cardio", "cardio");
    }


}
