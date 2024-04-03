package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.entities.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<SkillEntity,Long> {
}
