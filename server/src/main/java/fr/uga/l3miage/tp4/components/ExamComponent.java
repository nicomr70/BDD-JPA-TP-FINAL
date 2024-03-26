package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
@RequiredArgsConstructor
public class ExamComponent {
    private final ExamRepository examRepository;

    public ExamEntity getExamEntity(Long id){ // récupérer par son id
        return examRepository.findById(id).orElseThrow();
    }


    // Create
    public ExamEntity createExamEntity(){
        ExamEntity examEntity = ExamEntity
                .builder()
                .id(1L)
                .startDate(LocalDateTime.of(24,3,26,21,39,50))
                .endDate(LocalDateTime.of(25,3,26,21,39,50))
                .name("BD")
                .weight(10)
                .build();
        return examRepository.save(examEntity);
    }

    // Update de startDate
    public ExamEntity updateStartDate(Long id,LocalDateTime newStartDate){
        ExamEntity examEntity = examRepository.findById(id).orElseThrow();
        examEntity.setStartDate(newStartDate);
        return examRepository.save(examEntity);
    }


    // Update de endDate
    public ExamEntity updateEndDate(Long id,LocalDateTime newEndDate){
        ExamEntity examEntity = examRepository.findById(id).orElseThrow();
        examEntity.setEndDate(newEndDate);
        return examRepository.save(examEntity);
    }

    // Update de name
    public ExamEntity updateName(Long id,String newName){
        ExamEntity examEntity = examRepository.findById(id).orElseThrow();
        examEntity.setName(newName);
        return examRepository.save(examEntity);
    }


    // Update de weight
    public ExamEntity updatWeight(Long id,int newWeight){
        ExamEntity examEntity = examRepository.findById(id).orElseThrow();
        examEntity.setWeight(newWeight);
        return examRepository.save(examEntity);
    }


    //Drop
    public void deleteExamEntity(Long id){
        examRepository.deleteById(id);
    }

    /* TODO à implémenter
    public Set<ExamEntity> getAllCardioExam(){
        return null;
    }
    */

}
