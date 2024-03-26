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

    // Récupérer la liste des examens qui évaluent au moins une compétence en lien avec 'cardio' contenu dans le nom
    public Set<ExamEntity> getAllExamsWithCardioSkill() {
        return examRepository.findAllByNameContainingIgnoreCaseAndSkills_NameContainingIgnoreCase("cardio", "cardio");
    }
}

