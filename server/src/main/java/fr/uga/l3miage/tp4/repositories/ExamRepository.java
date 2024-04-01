package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity, Long> {

    // Récupérer la liste des examens qui évaluent au moins une compétence en lien avec 'cardio' contenu dans le nom.(fonction + ExamComponent)
    Set<ExamEntity> findExamEntitiesByNameContaining(String skill);
}
