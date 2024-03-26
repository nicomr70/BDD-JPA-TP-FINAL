package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.EcosSessionPogrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EcosSessionPogrammationStepRepository extends JpaRepository<EcosSessionPogrammationStepEntity, Long> {

    // 1/- Récupérer la dernière étape de la programmation qui devra être réalisée (fonction nommée)

    // j'utilise "EcosSessionPogrammationStepEntity" pour répondre a cette question car elle représente les étapes concrètes de la planification d'une session et contient les informations nécessaires pour déterminer la prochaine étape à réaliser.
    //@Query(value = "SELECT e FROM EcosSessionPogrammationStepEntity e WHERE e.dateTime = (SELECT MAX(dateTime) FROM EcosSessionPogrammationStepEntity)")
    EcosSessionPogrammationStepEntity findLatestStep();
}