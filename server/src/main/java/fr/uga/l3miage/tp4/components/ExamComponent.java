package fr.uga.l3miage.tp4.components;
import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.repositories.ExamEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class ExamComponent {

    private final ExamEntityRepository examEntityRepository;
    // Voir le commentaire  dans le fichier ExamEntityRepository.java
   // public Set<ExamEntity> getCandidatesCardio() {
    //    return examEntityRepository.findBySkillEntitiesNameContaining("Cardio");
  //  }

}