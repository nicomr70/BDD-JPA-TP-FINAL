package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.EcoSessionProgrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcosSessionProgrammationStepRepository extends JpaRepository<EcoSessionProgrammationStepEntity, Long> {
}
