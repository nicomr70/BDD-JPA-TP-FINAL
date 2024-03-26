package fr.uga.l3miage.tp4.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.l3miage.tp4.models.ExamEntity;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity, Long>{

    Set<ExamEntity> findAllBySkillName(String string);

}
