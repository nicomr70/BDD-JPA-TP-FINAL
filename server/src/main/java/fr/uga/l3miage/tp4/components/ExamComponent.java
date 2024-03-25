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
    private ExamRepository examRepository;

    public Set<ExamEntity> getAllCardioExam(){
        //récupérer tous les examens et filtrer par la suite
        Set<ExamEntity> allExams= new HashSet<>(examRepository.findAll());
        return allExams.stream()
                .filter(exam -> exam.getSkills().stream()
                        .anyMatch(skill -> skill.getName().contains("cardio")))
                .collect(Collectors.toSet());
    };

    //Remarque: Pour la même raison que dans CandidateComponent, JPA ne permet pas de réaliser le filtrage car la relation skills est @ManyToMany


}
