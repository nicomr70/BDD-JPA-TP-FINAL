package fr.uga.l3miage.tp4.repositories;


import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EcosSessionProgrammationStepRepository extends JpaRepository<EcosSessionProgrammationStepEntity, Long> {
    //R1
    EcosSessionProgrammationStepEntity findFirstByOrderByDateTimeDesc();

}
