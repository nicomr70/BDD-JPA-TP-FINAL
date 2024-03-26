package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;


@Component
@RequiredArgsConstructor
public class ExamComponent {
    private ExamRepository examRepository;

    public Set<ExamEntity> getAllCardioExam(){
        return examRepository.findAll().stream().filter(
                examEntity -> examEntity.getSkillEntities().contains("CARDIO")
        ).collect(Collectors.toSet());
    }


}
