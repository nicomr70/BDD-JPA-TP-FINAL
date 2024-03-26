package fr.uga.l3miage.tp4.components;

import com.sun.jdi.PrimitiveValue;
import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;


@Component
@RequiredArgsConstructor
public class ExamComponent {
    @Autowired
private  final ExamRepository examRepository;
    public Set<ExamEntity> getAllCardioExam(String name) {
        return new HashSet<>(examRepository.findByName(name));
    }

}
