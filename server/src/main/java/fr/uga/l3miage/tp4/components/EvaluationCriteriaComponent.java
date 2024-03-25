package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.repositories.EvaluationCriteriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EvaluationCriteriaComponent {
    private EvaluationCriteriaRepository evaluationCriteriaRepository;
}
