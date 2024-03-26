package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.EcosSessionEntity;
import fr.uga.l3miage.tp4.models.EcosSessionProgrammationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcosSessionProgrammationRepository extends JpaRepository<EcosSessionProgrammationEntity,Long> {
//EcosSessionProgrammationEntity
    //EcosSessionEntity findEcosSessionProgrammationEntityByName(String name);
    EcosSessionProgrammationEntity  findEcosSessionProgrammationEntityByName(String name);
}
