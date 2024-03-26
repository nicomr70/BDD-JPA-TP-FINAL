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
        ExaminerEntity ancien = examinerRepository.findById(id).orElseThrow();
        ancien.setFirstname(examinerEntity.getFirstname());
        ancien.setLastname(examinerEntity.getLastname());
        ancien.setEmail(examinerEntity.getEmail());
        ancien.setPhoneNumber(examinerEntity.getPhoneNumber());
        ancien.setLogin(examinerEntity.getLogin());
        ancien.setPassword(examinerEntity.getPassword());
        return examinerRepository.save(ancien);
    }

    public void deleteEcosSessionProgrammation(Long id){
        examinerRepository.deleteById(id);
    }

}
