package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.ExaminerEntity;
import fr.uga.l3miage.tp4.repositories.ExaminerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExaminerComponent {

    private final ExaminerRepository examinerRepository;

    public ExaminerEntity getEcosSessionProgrammation(Long id){
        return examinerRepository.findById(id).orElseThrow();

    }

    public ExaminerEntity createEcosSessionProgrammation(ExaminerEntity examinerEntity){
        return examinerRepository.save(examinerEntity);
    }

    public ExaminerEntity updateEcosSessionProgrammation(Long id, ExaminerEntity examinerEntity){
        ExaminerEntity examiner = examinerRepository.findById(id).orElseThrow();
        examiner.setFirtName(examinerEntity.getFirtName());
        examiner.setFirtName(examinerEntity.getLastName());
        examiner.setEmail(examinerEntity.getEmail());
        examiner.setPhoneNumber(examinerEntity.getPhoneNumber());
        examiner.setLogin(examinerEntity.getLogin());
        examiner.setPassword(examinerEntity.getPassword());
        return examinerRepository.save(examiner);
    }

    public void deleteEcosSessionProgrammation(Long id){
        examinerRepository.deleteById(id);
    }

}