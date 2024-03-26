package fr.uga.l3miage.tp4.repositories;


import fr.uga.l3miage.tp4.models.SkillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface SkillRepository extends JpaRepository<SkillEntity, Long> {

}
