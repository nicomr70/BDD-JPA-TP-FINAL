package fr.uga.l3miage.tp4.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.uga.l3miage.tp4.models.ExamEntity;

import java.util.Set;

@Repository
public interface ExamEntityRepository extends JpaRepository<ExamEntity, Long> {

    //ilya une erreur ici qui empeche le projet de build du coup lai mis en commentaire pour que le projet build


   // Set<ExamEntity> findBySkillEntitiesNameContaining(String cardio);



}
