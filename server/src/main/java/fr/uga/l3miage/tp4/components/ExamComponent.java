package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.ExamEntity;

import fr.uga.l3miage.tp4.repositories.ExamEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ExamComponent {

    private final ExamEntityRepository examEntityRepository;

    public Set<ExamEntity> getAllCardioExams(){
        return examEntityRepository.findAll().stream()
           
                .filter(exam -> exam.getSkills().stream()
                        .anyMatch(skill -> skill.getName().toLowerCase().contains("cardio")))
                .collect(Collectors.toSet());
    }

}
