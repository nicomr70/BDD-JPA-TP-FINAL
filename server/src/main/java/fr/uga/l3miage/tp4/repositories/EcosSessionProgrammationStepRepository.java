package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.EcoSessionProgrammationStepEntity;
import fr.uga.l3miage.tp4.models.EcosSessionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcosSessionProgrammationStepRepository extends JpaRepository<EcoSessionProgrammationStepEntity, Long> {
    //Récupérer la dernière étape de la programmation qui devra être réalisée (fonction nommée)
    // On a pas besoin de Optional car il y a au moins une étape
    EcoSessionProgrammationStepEntity findFirstByOrderByDateTimeDesc();
}
