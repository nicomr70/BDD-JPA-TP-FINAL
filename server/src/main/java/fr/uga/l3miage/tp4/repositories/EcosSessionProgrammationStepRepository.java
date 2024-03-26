package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationEntity;
import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcosSessionProgrammationStepRepository extends JpaRepository<EcosSessionProgrammationStepEntity,Long> {
    //Récupérer la dernière étape de la programmation qui devra être réalisée
    EcosSessionProgrammationStepEntity findTopByOrderByDateTimeDesc();

}
