package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.entities.ExamEntity;
import fr.uga.l3miage.tp4.entities.ExaminerEntity;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import fr.uga.l3miage.tp4.repositories.ExaminerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExaminerComponent {
    private final ExaminerRepository examinerRepository;

    public ExaminerEntity getExaminer(Long id){
        return examinerRepository.findById(id).orElseThrow();
    }

    public ExaminerEntity createExaminer(ExaminerEntity examinerEntity){
        return examinerRepository.save(examinerEntity);
    }

    public void deleteExaminer(Long id){
        examinerRepository.deleteById(id);
    }

    public ExaminerEntity updatePassword(Long id, String newPassword){
        ExaminerEntity examinerEntity = examinerRepository.findById(id).orElseThrow();
        examinerEntity.setPassword(newPassword);
        return examinerRepository.save(examinerEntity);
    }
}
