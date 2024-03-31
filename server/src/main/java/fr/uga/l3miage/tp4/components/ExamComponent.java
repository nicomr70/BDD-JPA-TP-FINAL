package fr.uga.l3miage.tp4.components;

import lombok.RequiredArgsConstructor;

import java.util.Set;

import org.springframework.stereotype.Component;

import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.repositories.ExamRepository;


@Component
@RequiredArgsConstructor
public class ExamComponent {
    private final ExamRepository examRepository;

    public Set<ExamEntity> getAllCardioExam(){
        return examRepository.findAllBySkillName("Cardio");
    }

}
