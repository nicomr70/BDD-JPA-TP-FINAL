package fr.uga.l3miage.tp4.repositorys;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcosSessionProgrammationStepRepository extends JpaRepository<EcosSessionProgrammationStepEntity, Long> {
    EcosSessionProgrammationStepEntity findTopByOrderByEndDateDesc();
}
