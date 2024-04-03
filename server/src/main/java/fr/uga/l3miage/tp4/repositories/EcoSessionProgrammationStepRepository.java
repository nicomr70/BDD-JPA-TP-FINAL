package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.entities.EcoSessionProgrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EcoSessionProgrammationStepRepository extends JpaRepository<EcoSessionProgrammationStepEntity,Long> {
    EcoSessionProgrammationStepEntity findFirstByDateTimeOrderByDateTimeDesc();

}
