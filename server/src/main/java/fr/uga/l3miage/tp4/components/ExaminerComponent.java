package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.ExaminerEntity;
import fr.uga.l3miage.tp4.repositories.ExaminerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExaminerComponent {
    private final ExaminerRepository examinerRepository;

    public ExaminerEntity getExaminer(Long id) {
        return examinerRepository.findById(id).orElseThrow();
    }

    public ExaminerEntity createExaminer(ExaminerEntity examiner) {
        return examinerRepository.save(examiner);
    }

    public ExaminerEntity updateExaminer(Long id, ExaminerEntity examinerEntity) {
        ExaminerEntity ancien = examinerRepository.findById(id).orElseThrow();
        ancien.setFirstname(examinerEntity.getFirstname());
        ancien.setLastname(examinerEntity.getLastname());
        ancien.setEmail(examinerEntity.getEmail());
        ancien.setPhonenumber(examinerEntity.getPhonenumber());
        ancien.setLogin(examinerEntity.getLogin());
        ancien.setPassword(examinerEntity.getPassword());
        return examinerRepository.save(ancien);
    }

    public void deleteExaminer(Long id) {
        examinerRepository.deleteById(id);
    }
}
