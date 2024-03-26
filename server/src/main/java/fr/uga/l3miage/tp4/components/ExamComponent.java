package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;


@Component
@RequiredArgsConstructor
public class ExamComponent {
    private final ExamRepository examRepository;

    public ExamEntity getExam(Long id){
        return examRepository.findById(id).orElseThrow();

    }

    public ExamEntity createCandidate(ExamEntity examEntity){
        return examRepository.save(examEntity);
    }

    public ExamEntity updateCandidate(Long id, ExamEntity examEntity){
        ExamEntity ancien = examRepository.findById(id).orElseThrow();
        ancien.setName(examEntity.getName());
        ancien.setWeight(examEntity.getWeight());
        ancien.setEndDate(examEntity.getEndDate());
        ancien.setStartDate(examEntity.getStartDate());
        ancien.setEcosSessionEntity(examEntity.getEcosSessionEntity());
        return examRepository.save(ancien);

    }

    public void deleteCandidate(Long id){
        examRepository.deleteById(id);
    }

    public Set<ExamEntity> getAllCardioExam(){
        return examRepository.findBySkillEntityRelatedToCardio();
    }


}
