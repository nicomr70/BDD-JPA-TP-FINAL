package fr.uga.l3miage.tp4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;

@Repository
public interface EcosSessionProgrammationStepRepository extends JpaRepository<EcosSessionProgrammationStepEntity, Long>{
    // Récupérer la dernière étape de la programmation
    public EcosSessionProgrammationStepEntity findLastStep();
}
