package fr.uga.l3miage.tp4.repositories;


import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.models.SkillEntity;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity,Long>{
    Set<ExamEntity> findAllByNameContaining(Set<SkillEntity> skillEntities);
}
