package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;


@Component
@RequiredArgsConstructor
public class ExamComponent {
    private final ExamRepository examRepository;

    // Cette méthode récupère tous les examens de cardiologie
    public Set<ExamEntity> getAllCardioExam(){
        return examRepository.findAll().stream()
                .filter(exam -> exam.getSkillEntities().stream().anyMatch(skill->
                        skill.getName().contains("cardio")))
                .collect(Collectors.toSet());
    }


}
