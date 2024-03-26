package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationEntity;
import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcosSessionProgrammationStepRepository extends JpaRepository<EcosSessionProgrammationStepEntity, Long> {
    // Cette méthode récupère la dernière étape de programmation pour une session
    // de programmation spécifique, triée par date et heure décroissantes
    EcosSessionProgrammationStepEntity findTopByEcosSessionProgrammationEntityOrderByDateTimeDesc(EcosSessionProgrammationEntity session);
}
