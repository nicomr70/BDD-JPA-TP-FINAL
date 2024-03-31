package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.EcoSessionEntity;
import fr.uga.l3miage.tp4.models.EcoSessionProgrammationEntity;
import fr.uga.l3miage.tp4.models.EcoSessionProgrammationStepEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


@Repository
public interface EcoSessionProgrammationRepository extends JpaRepository<EcoSessionProgrammationEntity,String> {


}