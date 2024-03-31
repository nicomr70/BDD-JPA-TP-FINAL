package fr.uga.l3miage.tp4.repositories;

import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;

@Repository
public interface EcosSessionProgrammationStepRepository extends JpaRepository<EcosSessionProgrammationStepEntity,Long>{
    Set<EcosSessionProgrammationStepEntity> findLastStepByDate(LocalDateTime date);
}
