package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.entities.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.file.LinkOption;
import java.util.Set;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity, Long> {
    Set<ExamEntity> findBySkillEntities_NameContaining(String skill);
}
