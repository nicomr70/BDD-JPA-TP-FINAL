package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.models.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity,String> {
}
