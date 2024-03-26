package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.entities.EcoSessionProgrammationEntity;
import fr.uga.l3miage.tp4.entities.EcoSessionProgrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcoSessionProgrammationRepository extends JpaRepository<EcoSessionProgrammationEntity,Long> {
}
