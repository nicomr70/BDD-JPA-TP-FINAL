package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.EcoSessionProgrammationStepEntity;
import fr.uga.l3miage.tp4.models.EcosSessionProgrammationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcosSessionProgrammationRepository extends JpaRepository<EcosSessionProgrammationEntity, Long> {
    //Récupérer la dernière étape de la programmation qui devra être réalisée (fonction nommée)
    // On a pas besoin de Optional car il y a au moins une étape
    EcoSessionProgrammationStepEntity findTopByOrderByDateTimeDesc();
}
