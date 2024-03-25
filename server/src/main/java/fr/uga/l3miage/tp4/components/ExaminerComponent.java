package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.repositories.ExaminerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExaminerComponent {
    private ExaminerRepository examinerRepository;
}
